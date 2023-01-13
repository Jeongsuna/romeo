from django.shortcuts import redirect, render

ALLOW_URL_LIST = [
    '127.0.0.1',
    '192.168.0.1',
    '192.168.0.100',
    'https://login.myservice.com',
    '/notice'
]


def bad(request):
    url_string = request.POST.get('url', '')
    return redirect(url_string)


def good(request):
    url_string = request.POST.get('url', '')
    if url_string not in ALLOW_URL_LIST:
        return render(request, '/error.html', {'ERROR': '허용되지 않는 주소입니다.'})
    return redirect(url_string)
