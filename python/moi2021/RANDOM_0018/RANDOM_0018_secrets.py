import random
import secrets


def bad():
    random_str = ''
    for i in range(6):
        random_str += str(random.randrange(10))
    return random_str


def good():
    random_str = ''
    for i in range(6):
        random_str += str(secrets.randbelow(10))
    return random_str
