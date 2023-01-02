import hashlib
import secrets


def bad(pw):
    h = hashlib.sha256(pw.encode())
    return h.digest()


def good(pw):
    salt = secrets.token_hex(32)
    h = hashlib.sha256(salt.encode() + pw.encode())
    return h.digest(), salt
