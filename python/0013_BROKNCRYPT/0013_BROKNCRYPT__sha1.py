from crypto.Hash import SHA
from crypto.Hash import SHA256


def bad(data):
    # FLAW:
    sha = SHA.new()
    sha.update(data)
    return sha.digest_size


def good(data):
    # FIX:
    sha = SHA256.new()
    sha.update(data)
    return sha.digest_size
