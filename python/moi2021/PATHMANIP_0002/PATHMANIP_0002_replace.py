import os
from django.shortcuts import render


def bad(request):
    request_file = request.POST.get('request_file')
    filename, file_ext = os.path.splitext(request_file)
    file_ext = file_ext.lower()
    if file_ext not in ['.txt', '.csv']:
        return render(request, '/error.html', {'error': '파일을 열수 없습니다.'})
    with open(request_file) as f:
        data = f.read()

    return render(request, '/success.html', {'data': data})


def good(request):
    request_file = request.POST.get('request_file')
    filename, file_ext = os.path.splitext(request_file)
    file_ext = file_ext.lower()
    if file_ext not in ['.txt', '.csv']:
        return render(request, '/error.html', {'error': '파일을 열수 없습니다.'})
    filename = filename.replace('.', '')
    filename = filename.replace('/', '')
    filename = filename.replace('\\', '')
    with open(filename + file_ext) as f:
        data = f.read()
        return render(request, '/success.html', {'data': data})
