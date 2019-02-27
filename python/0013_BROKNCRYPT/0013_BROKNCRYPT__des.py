from crypto.Cipher import DES
from crypto.Cipher import DES3


def enc_key():
    f = open("key.txt", 'r')
    encryption_key = f.readline()
    f.close()
    return encryption_key


def bad(iv):
    encryption_key = enc_key()
    # FLAW:
    cipher = DES.new(encryption_key, DES.MODE_OFB, iv)
    return iv + cipher.encrypt(b'very important')


def good(iv):
    encryption_key = enc_key()
    # FIX:
    cipher = DES3.new(encryption_key, DES3.MODE_OFB, iv)
    return iv + cipher.encrypt(b'very important')
