from crypto.Hash import MD5
from crypto.Hash import SHA256


def bad(data):
    # FLAW:
    sha = MD5.new()
    sha.update(data)
    return sha.digest_size


def good(data):
    # FIX:
    sha = SHA256.new()
    sha.update(data)
    return sha.digest_size
