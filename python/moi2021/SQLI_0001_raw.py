from django.shortcuts import render
from app.models import Member


def bad(request):
    name = request.POST.get('name', '')
    query = "select * from member where name=‘" + name + "’"
    data = Member.objects.raw(query)
    return render(request, '/member_list.html', {'member_list': data})


def good(request):
    name = request.POST.get('name', '')
    query = 'select * from member where name=%s'
    data = Member.objects.raw(query, [name])
    return render(request, '/member_list.html', {'member_list': data})
