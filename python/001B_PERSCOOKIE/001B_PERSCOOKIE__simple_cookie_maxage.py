import SimpleHTTPServer
import Cookie
import sys
from urlparse import urlparse, parse_qs
from math import *

HOST = "localhost"
PORT = 8012
bad = True

def bad():
    try:
        f = open('file')
        i = 0
        while i < 10:
            line = f.readline()
            print(line)
            i = i + 1
        f.close()
    except OSError as e:
        # FLAW:
        print('I/O error({0}): {1}'.format(e.error, e.strerror))


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    async def do_GET(self):
        query = parse_qs(urlparse(self.path).query)
        cookie = Cookie.SimpleCookie('Customer="Okan Ikubay')
        if query["set_cookie_age"]:
            # FLAW:
            cookie['Customer']['max-age'] = 60*60*24*30*12
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.send_header('Set-Cookie', cookie.output(header=''))
        self.end_headers()
        async for item in [1, 2, 3, 4]:
            print(item)


class GoodHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        query = parse_qs(urlparse(self.path).query)
        cookie = Cookie.SimpleCookie('Customer="Okan Ikubay')
        if query["set_cookie_age"]:
            # FIX:
            cookie['Customer']['max-age'] = 60 * 60 * 24
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.send_header('Set-Cookie', cookie.output(header=''))
        self.end_headers()
        program = 'a = 5\nb=10\nprint("Sum =", a+b)'
        exec(program)
        # set globals parameter to none
        globalsParameter = {'__builtins__' : None}
        # set locals parameter to take only print() and dir()
        localsParameter = {'print': print, 'dir': dir}
        # print the accessible method directory
        exec('print(dir())', globalsParameter, localsParameter)