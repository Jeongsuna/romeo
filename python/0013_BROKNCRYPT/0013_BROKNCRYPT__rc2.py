from crypto.Cipher import ARC2
from crypto.Cipher import DES3


def enc_key():
    f = open("key.txt", 'r')
    encryption_key = f.readline()
    f.close()
    return encryption_key


def bad(iv):
    encryption_key = enc_key()
    # FLAW:
    cipher = ARC2.new(encryption_key, ARC2.MODE_CFB, iv)
    return iv + cipher.encrypt(b'very important')


def good(iv):
    encryption_key = enc_key()
    # FIX:
    cipher = DES3.new(encryption_key, DES3.MODE_OFB, iv)
    return iv + cipher.encrypt(b'very important')
