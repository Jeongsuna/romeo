import json

import pymysql


def bad(query):
    dbconn = pymysql.connect(host='127.0.0.1', port=1234, user='root', password='1234', db='mydb', charset='utf8')
    curs = dbconn.cursor()
    curs.execute(query)
    dbconn.commit()
    dbconn.close()


def good(query, config_path):

    with open(config_path, 'r') as config:
        dbconf = json.load(fp=config)
        blockKey = get_decrypt_key('blockKey')
        dbUser = decrypt(blockKey, dbconf['user'])
        dbPasswd = decrypt(blockKey, dbconf['passwd'])
        dbconn = pymysql.connect(host=dbconf['host'], port=dbconf['port'], user=dbUser, passwd=dbPasswd,
                                 db=dbconf['db_name'], charset='utf8')
        curs = dbconn.cursor()
        curs.execute(query)
        dbconn.commit()
        dbconn.close()


def get_decrypt_key(param):
    pass


def decrypt(blockKey, param):
    pass