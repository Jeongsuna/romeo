from lxml import etree
import SimpleHTTPServer
import SocketServer
import time
from urlparse import urlparse, parse_qs

HOST = 'example.net'  # !!!REMEMBER TO CHANGE THIS!!!
PORT = 80  # Maybe set this to 9000.
bad = True


class BadRedirectHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        query = parse_qs(urlparse(self.path).query)
        tree = etree.parse('articles.xml')
        email_addr = "/accounts/account[acctID=" + query["acct"] + "]/email/text()"
        r = tree.xpath(email_addr)


class GoodRedirectHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def do_GET(self):
        query = parse_qs(urlparse(self.path).query)
        tree = etree.parse('articles.xml')
        email_addr = "/accounts/account[acctID= $var]/email/text()"
        r = tree.xpath(email_addr, var=query["acct"])


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