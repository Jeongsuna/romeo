import SimpleHTTPServer
import SocketServer
import time
from urlparse import urlparse, parse_qs

HOST = 'example.net'  # !!!REMEMBER TO CHANGE THIS!!!
PORT = 80  # Maybe set this to 9000.
REDIRECTIONS = {"/slashdot/": "http://slashdot.org/",
                "/freshmeat/": "http://freshmeat.net/"}
LAST_RESORT = "http://google.com/"
bad = True


class GoodRedirectHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_HEAD(self):
        query = parse_qs(urlparse(self.path).query)
        self.send_response(301)
        self.send_header("Location", REDIRECTIONS.get(query["address"], LAST_RESORT))
        self.end_headers()

    def do_GET(self):
        self.do_HEAD()


class BadRedirectHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_HEAD(self):
        query = parse_qs(urlparse(self.path).query)
        self.send_response(301)
        self.send_header("Location", "http://www." + query["address"].pop())
        self.end_headers()

    def do_GET(self):
        self.do_HEAD()


if __name__ == '__main__':
    if bad:
        httpd = SocketServer.TCPServer(("", PORT), BadRedirectHandler)
    else:
        httpd = SocketServer.TCPServer(("", PORT), GoodRedirectHandler)
    print time.asctime(), "Server Starts - %s:%s" % (HOST, PORT)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass
    httpd.server_close()
    print time.asctime(), "Server Stops - %s:%s" % (HOST, PORT)