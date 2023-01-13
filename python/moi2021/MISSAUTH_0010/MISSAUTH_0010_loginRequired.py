from django.contrib.auth.decorators import login_required
from django.shortcuts import render
from re import escape
import hashlib


def update_password_from_db(user, param):
    pass


def get_password_from_db(user):
    pass


def bad(request):
    new_pwd = request.POST.get('new_password', '')

    user = '%s' % escape(request.session['userid'])

    sha = hashlib.sha256(new_pwd.encode())
    update_password_from_db(user, sha.hexdigest())

    return render(request, '/success.html')


@login_required
def good(request):
    new_pwd = request.POST.get('new_password', '')
    crnt_pwd = request.POST.get('current_password', '')

    user = '%s' % escape(request.session['userid'])
    crnt_h = hashlib.sha256(crnt_pwd.encode())
    h_pwd = crnt_h.hexdigest()

    old_pwd = get_password_from_db(user)

    if old_pwd == h_pwd:
        new_h = hashlib.sha256(new_pwd.encode())
        update_password_from_db(user, new_h.hexdigest())
        return render(request, '/success.html')
