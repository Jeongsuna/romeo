import SimpleHTTPServer
import os
from urlparse import urlparse, parse_qs

HOST = "localhost"
PORT = 8012
bad = True


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["cmd"]:
            # FLAW:
            os.system(query["cmd"])


class GoodHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    allowed = ['ls', 'find']

    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["cmd"]:
            # FIX:
            if query["cmd"] in GoodHandler.allowed:
                os.system(query["cmd"])