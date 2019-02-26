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
        if query["name"]:
            # FLAW:
            os.open("/" % query["name"])


class GoodHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["name"]:
            # FIX:
            san = query["name"].pop().replace("\.\.", "").replace("/", "").replace("\\\\", "")
            os.open("/" % san)