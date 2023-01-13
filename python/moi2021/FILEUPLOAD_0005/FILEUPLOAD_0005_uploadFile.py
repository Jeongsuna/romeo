import os
from django.shortcuts import render
from django.core.files.storage import FileSystemStorage

FILE_COUNT_LIMIT = 5
FILE_SIZE_LIMIT = 5242880
WHITE_LIST_EXT = [
    '.jpg',
    '.jpeg'
]


def bad(request):
    if request.FILES['upload_file']:
        upload_file = request.FILES['upload_file']
        fs = FileSystemStorage(location='media/screenshot', base_url='media/screenshot')
        filename = fs.save(upload_file.name, upload_file)
        return render(request, '/success.html', {'filename': filename})
    return render(request, '/error.html', {'error': '파일 업로드 실패'})


def good(request):
    if len(request.FILES) == 0 or len(request.FILES) > FILE_COUNT_LIMIT:
        return render(request, '/error.html', {'error': '파일 개수 초과'})
    for filename, upload_file in request.FILES.items():
        if upload_file.content_type != 'image/jpeg':
            return render(request, '/error.html', {'error': '파일 타입 오류'})
        if upload_file.size > FILE_SIZE_LIMIT:
            return render(request, '/error.html', {'error': '파일사이즈 오류'})
        file_name, file_ext = os.path.splitext(upload_file.name)
        if file_ext.lower() not in WHITE_LIST_EXT:
            return render(request, '/error.html', {'error': '파일 타입 오류'})
    fs = FileSystemStorage(location='media/screenshot', base_url='media/screenshot')
    for upload_file in request.FILES.values():
        fs.save(upload_file.name, upload_file)
    return render(request, '/success.html', {'filename': filename})
