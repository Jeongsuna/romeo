import copy


class UserObj():
    __private_variable = []

    def __init__(self):
        pass

    # private 배열을 리턴하는 public  메소드를 사용하는 경우 취약함
    def get_private_member(self):
        return self.__private_variable