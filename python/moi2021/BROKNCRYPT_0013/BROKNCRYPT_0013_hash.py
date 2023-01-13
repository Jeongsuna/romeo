import hashlib


def bad(plain_text):
    hash_text = hashlib.md5(plain_text.encode('utf-8')).hexdigest()
    return hash_text


def good(plain_text):
    hash_text = hashlib.sha256(plain_text.encode('utf-8')).hexdigest()
    return hash_text