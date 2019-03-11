import random
import os


def bad(page_name):
    # FLAW:
    rand_num = random.randint(1, 10)
    return page_name + rand_num


def good(page_name):
    # FIX:
    rand_num = os.urandom(5)
    return page_name + rand_num
