from django.shortcuts import render
from django.views.decorators import csrf


@csrf.exempt
def bad(request):
    user_id = request.POST.get('user_id', '')
    pay = request.POST.get('pay', '')
    product_info = request.POST.get('product_info', '')

    ret = pay(user_id, pay, product_info)

    return render(request, '/view_wallet.html', {'wallet': ret})


# @csrf_exempt
def good(request):
    user_id = request.POST.get('user_id', '')
    pay = request.POST.get('pay', '')
    product_info = request.POST.get('product_info', '')

    ret = pay(user_id, pay, product_info)

    return render(request, '/view_wallet.html', {'wallet': ret})
