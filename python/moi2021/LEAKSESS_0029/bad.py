from django.http import request
from django.shortcuts import render

class UserDescription:
    user_name = ''

    def get_user_profile(self):
        result = self.get_user_discription(UserDescription.user_name)
        return result

    def show_user_profile(self, name):

        # 클래스변수는 다른 세션과 공유되는 값이기 때문에 멀티스레드
        # 환경에서 공유되지 말아야할 자원에 대해서 사용하는 경우
        # . 다른 세션에 의해 데이터가 노출될 수 있다
        UserDescription.user_name = name
        self.user_profile = self.get_user_profile()

        return render(request, 'profile.html', {'profile': self.user_profile})
