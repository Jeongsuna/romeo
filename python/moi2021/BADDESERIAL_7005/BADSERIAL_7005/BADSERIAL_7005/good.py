import hmac
import hashlib
import pickle
from django.shortcuts import render

def load_user_object(request):
    hash_pickle = bytes(request.POST.get('hash_pickle', ''), encoding = "utf-8")
    userinfo = bytes(request.POST.get('userinfo', ''), encoding = "utf-8")
    # HMAC 검증을 위한 비밀키는 안전하게 저장하여 사용
    m = hmac.new(key=b'secret_key', digestmod=hashlib.sha512)
    m.update(userinfo)
    # 전달받은 해시값(hash_pickle) 과 직렬화 데이터(userinfo) 의
    # 해시값을 비교하여 검증
    if hmac.compare_digest(m.digest(), hash_pickle):
        user_obj = pickle.loads(userinfo)
        return render(request, '/load_user_obj.html', {'obj':user_obj})
    else:
        return render(request, '/error.html', {'error':' .'})
