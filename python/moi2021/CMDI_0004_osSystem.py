import os
from django.shortcuts import render
ALLOW_PROGRAM = ['notepad', 'calc']




def bad(request):
    app_name_string = request.POST.get('app_name','')
    os.system(app_name_string)
    return render(request, '/success.html')



def good(request):
    app_name_string = request.POST.get('app_name','')
    if app_name_string not in ALLOW_PROGRAM:
     return render(request, '/error.html', {'ERROR':'허용되지 않은 프로그램입니다.'})
    os.system(app_name_string)
    return render(request, '/success.html')