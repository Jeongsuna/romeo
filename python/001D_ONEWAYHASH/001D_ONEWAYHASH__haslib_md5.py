import hashlib


def use(user, password):
    pass


def bad(user, password):
    hasher = hashlib.new('md5')
    # FLAW:
    hasher.update(password)
    hashed = hasher.digest()
    use(user, hashed)


def good(user, password, salt):
    # FIX:
    hasher = hashlib.new('md5', salt)
    hasher.update(password)
    hashed = hasher.digest()
    use(user, hashed)
