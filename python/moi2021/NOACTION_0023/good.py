import os
import binascii
import base64
import secrets
from crypto.Cipher import AES

static_keys=[
    {'key' : b'\xb9J\xfd\xa9\xd2\xefD\x0b\x7f\xb2\xbcy\x9c\xf7\x9c',
    'iv' : b'\xf1BZ\x06\x03TP\xd1\x8a\xad"\xdc\xc3\x08\x88\xda'},
    {'key' : b'Z\x01$.:\xd4u3~\xb6TS(\x08\xcc\xfc',
    'iv' : b'\xa1a=:\xba\xfczv]\xca\x83\x9485\x14\x17'},
]
def encryption(key_id, plain_text):
    static_key = {'key':b'0000000000000000', 'iv':b'0000000000000000'}
    try:
        static_key = static_keys[key_id]
    except IndexError:
        # key 선택 중 오류 발생 시 랜덤으로 암호화 키를 생성하도록 설정
        static_key = {'key': secrets.token_bytes(16), 'iv': secrets.token_bytes(16)}
        static_keys.append(static_key)

    cipher_aes = AES.new(static_key['key'],AES.MODE_CBC,static_key['iv'])
    encrypted_data = base64.b64encode(cipher_aes.encrypt(plain_text))
    return encrypted_data.decode('ASCII')