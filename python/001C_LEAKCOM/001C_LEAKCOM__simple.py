import pymysql


def bad(db, user, pw, name):
    cmd = "SELECT col FROM table WHERE name ='%s'" % name
    # FLAW:
    # id: test password: 1234test for test
    connection = pymysql.connect(db=db, user=user, password=pw)
    connection.cursor().execute(cmd)


def good(db, user, pw, name):
    cmd = "SELECT col FROM table WHERE name ='%s'" % name
    # FIX:
    connection = pymysql.connect(db=db, user=user, password=pw)
    connection.cursor().execute(cmd)