from django.shortcuts import render
from django.utils.safestring import mark_safe

def bad(request):
    profile_url = request.POST.get('profile_url')
    profile_name = request.POST.get('profile_name')
    object_link = '<a href="{}">{}</a>'.format(profile_url, profile_name)
    object_link = mark_safe(object_link)
    return render(request, 'my_profile.html',{'object_link':object_link})


def good(request):
    profile_url = request.POST.get('profile_url')
    profile_name = request.POST.get('profile_name')
    object_link = '<a href="{}">{}</a>'.format(profile_url, profile_name)
    return render(request, 'my_profile.html',{'object_link':object_link})