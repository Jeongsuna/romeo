import socket
from django.shortcuts import render
ALLOW_PORT = [4000, 6000, 9000]


def bad(request):

    port = request.POST.get('port')
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.bind(('127.0.0.1', port))
        return render(request, '/success')
    return render(request, '/error', {'error':'소켓연결 실패'})


def good(request):
    port = int(request.POST.get('port'))
    if port not in ALLOW_PORT:
        return render(request, '/error', {'error':'소켓연결 실패'})
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.bind(('127.0.0.1', port))
    return render(request, '/success')
