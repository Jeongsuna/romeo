import copy

class UserObj():
    __private_variable = []
    def __init__(self):
        pass

    # private public 배열에 외부 값을 바로 대입하는 메소드를 사용하는
    # 경우 취약함
    def set_private_member(self, num):
        self.__private_variable = num
