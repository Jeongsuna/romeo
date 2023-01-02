import hashlib
from django.shortcuts import render

from secureCoidng import models

LOGIN_TRY_LIMIT = 5


def bad(request):
    user_id = request.POST.get('user_id', '')
    user_pw = request.POST.get('user_pw', '')

    sha = hashlib.sha256()
    sha.update(user_pw)

    hashed_passwd = get_user_pw(user_id)

    if sha.hexdigest() == hashed_passwd:
        return render(request, '/index.html', {'state': 'login_success'})
    else:
        return render(request, '/login.html', {'state': 'login_failed'})


def good(request):
    user_id = request.POST.get('user_id', '')
    user_pw = request.POST.get('user_pw', '')

    login_fail = models.LoginFail.objects.filter(user_id)

    if login_fail.count() >= LOGIN_TRY_LIMIT:
        return render(request, '/account_lock.html', {'state': 'account_lock'})
    else:
        sha = hashlib.sha256()
        sha.update(user_pw)
        hashed_passwd = get_user_pw(user_id)

        if sha.hexdigest() == hashed_passwd:
            models.LoginFail.objects.filter(user_id).delete()
            return render(request, '/index.html', {'state': 'login_success'})
        else:
            models.LoginFail.objects.create(user_id)
            return render(request, '/login.html', {'state': 'login_failed'})


def get_user_pw(user_id):
    pass
