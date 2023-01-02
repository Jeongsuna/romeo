from audioop import error

from django.shortcuts import render
import requests

ALLOW_SERVER_LIST = [
    'https://127.0.0.1/latest/',
    'https://192.168.0.1/user_data',
    'https://192.168.0.100/v1/public'
]


def bad(request):
    addr = request.POST.get('address', '')
    result = requests.get(addr).text
    return render(request, '/result.html', {'result': result})


def good(request):
    addr = request.POST.get('address', '')
    if addr not in ALLOW_SERVER_LIST:
        return render(request, '/error.html', {'error': '허용되지 않은 서버입니다.'})
    result = requests.get(addr).text
    return render(request, '/result.html', {'result': result})
