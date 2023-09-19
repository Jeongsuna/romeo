import pymysql
import SimpleHTTPServer
import SocketServer
from urlparse import urlparse, parse_qs
from django.shortcuts import render
from django.db import connection

HOST = "localhost"
PORT = 8012
bad = True


class BadHandler(SimpleHTTPServer.SimpleHTTPRequestHandler):
    def cursor(self, db):
        connection = pymysql.connect(db)
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

    def exceptionGroup(self):
        exec_gr = ExceptionGroup('ExceptionGroup Message!',
                                 [FileNotFoundError("This File is not found"),
                                  ValueError("Invalid Value Provided"),
                                  ZeroDivisionError("Trying to divide by 0")])
        raise exec_gr

    def runMatch(self, request):
        user = str(input("Write your username -: "))

        # match statement starts here .
        match user:
            case "Om":
                print("Om do not have access to the database \
                only for the api code.")
            case "Vishal":
                print(
                    "Vishal do not have access to the database , \
                    only for the frontend code.")

            case "Rishabh":
                print("Rishabh have the access to the database")
                name = request.POST.get('name', '')
                content_id = request.POST.get('content_id', '')
                sql_query = "update board set name='" + name + "' where content_id='" + content_id + "'"
                curs.execute(sql_query)
                curs.commit()
                return render(request, '/success.html')

            case _:

                try:
                    self.exceptionGroup()
                except ExceptionGroup as eg:
                    print(eg.exceptions)
                print("You do not have any access to the code")