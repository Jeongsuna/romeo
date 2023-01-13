from Crypto.Hash import SHA256


def bad(dbconn, password, user_id):
    curs = dbconn.curs()
    curs.execute('UPDATE USERS SET PASSWORD=%s WHERE USER_ID=%s', password, user_id)


def good(dbconn, password, user_id, salt):
    hash_obj = SHA256.new()
    hash_obj.update(bytes(password + salt, 'utf-8'))
    hash_pwd = hash_obj.hexdigest()
    curs = dbconn.curs()
    curs.execute('UPDATE USERS SET PASSWORD=%s WHERE USER_ID=%s', (hash_pwd, user_id))
