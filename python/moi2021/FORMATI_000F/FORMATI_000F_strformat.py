from django.shortcuts import render
AUTHENTICATE_KEY = 'Passw0rd'


def get_user_info(param):
    pass


def bad(request):
    user_info = get_user_info(request.POST.get('user_id', ''))
    format_string = request.POST.get('msg_format', '')
    message = format_string.format(user=user_info)
    return render(request, '/user_page', {'message':message})


def good(request):
    user_info = get_user_info(request.POST.get('user_id', ''))
    message = 'user name is {}'.format(user_info.name)
    return render(request, '/user_page', {'message':message})


