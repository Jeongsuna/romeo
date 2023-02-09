from django.shortcuts import render


def bad(request):
    roll = request.COOKIE['role']
    request_id = request.POST.get('user_id', '')
    request_mail = request.POST.get('user_email', '')
    if roll == 'admin':
        password_init_and_sendmail(request_id, request_mail)
        return render(request, '/sucess.html')
    else:
        return render(request, '/failed.html')


def good(request):
    roll = request.session['role']
    request_id = request.POST.get('user_id', '')
    request_mail = request.POST.get('user_email', '')
    if roll == 'admin':
        password_init_and_sendmail(request_id, request_mail)
        return render(request, '/sucess.html')
    else:
        return render(request, '/failed.html')


def password_init_and_sendmail(request_id, request_mail):
    pass
