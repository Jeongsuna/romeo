from django.http import HttpResponse


def bad(request):
    content_type = request.POST.get('contnet-type')
    res = HttpResponse()
    res['Content-Type'] = content_type
    return res


def good(request):
    content_type = request.POST.get('contnet-type')
    content_type = content_type.replace('\r', '')
    content_type = content_type.replace('\n', '')
    res = HttpResponse()
    res['Content-Type'] = content_type
    return res
