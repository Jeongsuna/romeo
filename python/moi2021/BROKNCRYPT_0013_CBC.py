import base64
from Crypto.Cipher import DES
from Crypto.Cipher import AES


def bad(plain_text, key):
    cipher_des = DES.new(key, DES.MODE_ECB)
    encrypted_data = base64.b64encode(cipher_des.encrypt(plain_text))
    return encrypted_data.decode('ASCII')


def good(plain_text, key, iv):
    cipher_aes = AES.new(key, AES.MODE_CBC, iv)
    encrypted_data = base64.b64encode(cipher_aes.encrypt(plain_text))
    return encrypted_data.decode('ASCII')
