import os
import socket
from curses.ascii import BS
from Crypto.Cipher import AES
from Crypto.Util.Padding import pad

HOST = '127.0.0.1'
PORT = 65434


def bad(password):

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((HOST, PORT))
        s.sendall(password.encode('utf-8'))
        data = s.recv(1024)


def good(password):
    block_key = os.environ.get('BLOCK_KEY')
    aes = AEScipher(block_key)
    enc_passowrd = aes.encrypt(password)
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((HOST, PORT))
        s.sendall(enc_passowrd.encode('utf-8'))
        data = s.recv(1024)


class AEScipher:
    BS = AES.block_size

    def __init__(self, s_key):
        self.s_key = s_key

    def pad(m):
        return m + bytes([BS - len(m) % BS] * (BS - len(m) % BS))

    def encrypt(self, plain):
        plain = pad(plain.encode())
        iv = os.environ.get('IV_KEY')
        cipher = AES.new(self.s_key, AES.MODE_CBC, iv)
        return (iv + cipher.encrypt(plain))