from crypto.Cipher import AES


def bad(iv):
    # FLAW:
    encryption_key = b'_hardcoded__key_'
    cipher = AES.new(encryption_key, AES.MODE_CFB, iv)
    return iv + cipher.encrypt(b'Attack at dawn')


def good(iv):
    f = open("key.txt", 'r')
    # FIX:
    encryption_key = f.readline()
    f.close()
    cipher = AES.new(encryption_key, AES.MODE_CFB, iv)
    return iv + cipher.encrypt(b'Attack at dawn')