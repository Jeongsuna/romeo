from django.shortcuts import render

WHITE_LIST = ['get_friends_list', 'get_address', 'get_phone_number']


def bad(request):

    function_name = request.POST.get('function_name', '')

    ret = exec('{}()'.format(function_name))

    return render(request, '/success', {'data': ret})


def good(request):

    function_name = request.POST.get('function_name', '')

    if function_name in WHITE_LIST:
        ret = exec('{}()'.format(function_name))
        return render(request, '/success', {'data': ret})

    return render(request, '/error', {'error': '허용되지 않은 함수입니다.'})
