from django.http import request
from django.shortcuts import render

class UserDescription:

    def get_user_profile(self):
        result = self.get_user_discription(self.user_name)
        return result

    def show_user_profile(self, name):

        # 인스턴스 변수로 사용하여 스레드 간 공유되지 못하도록 한다.

        self.user_name = name
        self.user_profile = self.get_user_profile()

        return render(request, 'profile.html', {'profile': self.user_profile})
