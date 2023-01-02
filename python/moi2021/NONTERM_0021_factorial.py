def factorial_bad(num):
    return num * factorial_bad(num - 1)


if __name__ == '__main__':
    itr = 5
    result = factorial_bad(itr)
    print(str(itr) + ' 팩토리얼 값은 : ' + str(result))


def factorial_good(num):
    if (num == 0):
        return 1
    else:
        return num * factorial_good(num - 1)


if __name__ == '__main__':
    itr = 5
    result = factorial_good(itr)
    print(str(itr) + ' 팩토리얼 값은 : ' + str(result))
