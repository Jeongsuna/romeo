from django.http import HttpResponse


def bad(request):
    res = HttpResponse()
    res.set_cookie('rememberme', 1, max_age=60 * 60 * 24 * 365)
    return res


def good(request):
    res = HttpResponse()
    res.set_cookie('rememberme', 1, max_age=60 * 60, secure=True, httponly=True)
    return res
