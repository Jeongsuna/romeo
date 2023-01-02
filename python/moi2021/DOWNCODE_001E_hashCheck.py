import hashlib
import requests
from flask import config


def bad():
    url = "https://www.somewhere.com/storage/code.py"

    file = requests.get(url)
    remote_code = file.content

    file_name = 'save.py'
    with open(file_name, 'wb') as f:
        f.write(file.content)


def good():
    url = "https://www.somewhere.com/storage/code.py"
    remote_code_hash = config.get('HASH', 'file_hash')

    file = requests.get(url)
    remote_code = file.content

    sha = hashlib.sha256()
    sha.update(remote_code)

    if sha.hexdigest() != remote_code_hash:
        raise Exception('파일이 손상되었습니다.')

    file_name = 'save.py'
    with open(file_name, 'wb') as f:
        f.write(file.content)
