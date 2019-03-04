import hashlib


def use(user, password):
    print(user + " - " + password)


def bad(user, password, salt):
    # FLAW:
    hasher = hashlib.new('md5', salt)
    hasher.update(password)
    hashed = hasher.digest()
    use(user, hashed)


def good(user, password, salt):
    # FIX:
    hasher = hashlib.new('sha512', salt)
    hasher.update(password)
    hashed = hasher.digest()
    use(user, hashed)


if __name__ == '__main__':
    bad("id", "pw", "salt")
