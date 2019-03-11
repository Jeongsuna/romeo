import pymysql


def bad(db, user, name):
    password = "p_ssw_rd"
    cmd = "SELECT col FROM table WHERE name ='%s'" % name
    # FLAW:
    connection = pymysql.connect(db=db, user=user, password=password)
    connection.cursor().execute(cmd)


def good(db, user, pw, name):
    cmd = "SELECT col FROM table WHERE name ='%s'" % name
    # FIX:
    connection = pymysql.connect(db=db, user=user, password=pw)
    connection.cursor().execute(cmd)
