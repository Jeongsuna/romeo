import pickle
from django.shortcuts import render

def load_user_object(request):
    userinfo = bytes(request.POST.get('userinfo', ''), encoding = "utf-8")
    # 사용자로부터 입력받은 알 수 없는 데이터를 직렬화
    user_obj = pickle.loads(userinfo)
    return render(request, '/load_user_obj.html', {'obj':user_obj})