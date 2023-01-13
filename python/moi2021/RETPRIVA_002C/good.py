import copy

class UserObj():
    __private_variable = []

    def __init__(self):
        pass

    # private 배열을 반환하는 경우 [:]를 사용하여 외부와 내부의
    # 배열이 서로 참조되지 않도록 해야 한다.
    def get_private_member(self):
        return self.__private_variable[:]