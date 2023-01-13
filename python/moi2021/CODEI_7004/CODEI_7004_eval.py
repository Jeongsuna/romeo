from django.shortcuts import render


def bad(request):
    message = request.POST.get('message', '')
    ret = eval(message)
    return render(request, '/success.html', {'data': ret})


def good(request):
    message = request.POST.get('message', '')
    if message.isalnum():
        ret = eval(message)
    return render(request, '/success.html', {'data': ret})
