from django.shortcuts import render
from django.db import connection


# Create your views here.

def bad(request):

    dbconn = connection

    with dbconn.cursor() as curs:
        name = request.POST.get('name', '')
        content_id = request.POST.get('content_id', '')
        sql_query = "update board set name='" + name + "' where content_id='" + content_id + "'"
        curs.execute(sql_query)
        curs.commit()
        return render(request, '/success.html')


def good(request):

    dbconn = connection

    with dbconn.cursor() as curs:
        name = request.POST.get('name', '')
        content_id = request.POST.get('content_id', '')
        sql_query = 'update board set name=%s where content_id=%s'
        curs.execute(sql_query, (name, content_id))
        curs.commit()
        return render(request, '/success.html')
