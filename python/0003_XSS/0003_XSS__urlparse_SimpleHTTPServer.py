import SimpleHTTPServer
import SocketServer
from urlparse import urlparse, parse_qs

HOST = "localhost"
PORT = 8012
bad = False


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["name"]:
            # FLAW:
            self.wfile.write("<html><head><title>Hello</title></head>")
            self.wfile.write("<body><p>Test</p>")
            self.wfile.write("<p>path: %s</p>" % self.path)
            if query["name"]:
                # FLAW:
                self.wfile.write("<p>name: %s</p>" % query["name"])
            self.wfile.write("</body></html>")


class GoodHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["name"]:
            # FIX:
            self.wfile.write("<html><head><title>Hello</title></head>")
            self.wfile.write("<body><p>Test</p>")
            self.wfile.write("<p>path: %s</p>" % self.path)
            if query["name"]:
                name = query["name"].pop()
                # FIXED:
                san = name.replace("<", "&lt;").replace(">", "&gt;").replace("&", "&amp;").replace("\"", "&quot;")
                self.wfile.write("<p>name: %s</p>" % san)
            self.wfile.write("</body></html>")


if __name__ == '__main__':
    if bad:
        httpd = SocketServer.TCPServer(("", PORT), BadHandler)
    else:
        httpd = SocketServer.TCPServer(("", PORT), GoodHandler)
    print "Server Starts - %s:%s" % (HOST, PORT)
    try:
        httpd.serve_forever()
    except KeyboardInterrupt:
        pass
    httpd.server_close()
    print "Server Stops - %s:%s" % (HOST, PORT)