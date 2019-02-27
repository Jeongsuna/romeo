from crypto.Hash import MD4
from crypto.Hash import SHA256


def bad(data):
    # FLAW:
    sha = MD4.new()
    sha.update(data)
    return sha.digest_size


def good(data):
    # FIX:
    sha = SHA256.new()
    sha.update(data)
    return sha.digest_size
