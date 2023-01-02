import random
import secrets
import string


def bad():
    RANDOM_STRING_CHARS = string.ascii_letters + string.digits
    return "".join(random.choice(RANDOM_STRING_CHARS) for i in range(32))


def good():
    RANDOM_STRING_CHARS = string.ascii_letters + string.digits
    return "".join(secrets.choice(RANDOM_STRING_CHARS) for i in range(32))
