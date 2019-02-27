import base64
import os
import sqlite3


def bad():
    props = os.open('config.properties')
    password = base64.b64decode(props[0])

    # FLAW:
    connection = sqlite3.connect(host="localhost", user="user", passwd=password, db="accounts")
