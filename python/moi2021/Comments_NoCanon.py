from django.contrib.auth import login


def bad(id, passwd):
    # id = admin
    # passwd = passw0rd
    result = login(id, passwd)
    return result


def good(id, passwd):
    result = login(id, passwd)
    return result
