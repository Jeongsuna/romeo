import SimpleHTTPServer
import Cookie
from urlparse import urlparse, parse_qs

HOST = "localhost"
PORT = 8012
bad = True


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        query = parse_qs(urlparse(self.path).query)
        cookie = Cookie.SimpleCookie('Customer="Okan Ikubay')
        if query["set_cookie_age"]:
            # FLAW:
            cookie['Customer']['max-age'] = 60*60*24*30*12
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.send_header('Set-Cookie', cookie.output(header=''))
        self.end_headers()


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