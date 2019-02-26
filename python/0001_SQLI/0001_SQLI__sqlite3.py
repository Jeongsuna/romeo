import sqlite3
import SimpleHTTPServer
import SocketServer
from urlparse import urlparse, parse_qs

HOST = "localhost"
PORT = 8012
bad = True


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def cursor(self, db):
        connection = sqlite3.connect(db)
        return connection.cursor()

    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["name"]:
            # FLAW:
            cmd = "SELECT col FROM table WHERE name ='%s'" % (query["name"])
            cursor = self.cursor("company.db")
            cursor.execute(cmd)


class GoodHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def cursor(self, db):
        connection = sqlite3.connect(db)
        return connection.cursor()

    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.end_headers()
        query = parse_qs(urlparse(self.path).query)
        if query["name"]:
            # FIX:
            cmd = "SELECT col FROM table WHERE name =%s"
            cursor = self.cursor("company.db")
            cursor.execute(cmd, query["name"])


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