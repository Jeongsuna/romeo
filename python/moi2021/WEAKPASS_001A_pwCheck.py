import re
from flask import request, make_response, app
from models import User
from models import db


@app.route('/register', methods=['POST'])
def bad():
    userid = request.form.get('userid')
    password = request.form.get('password')
    confirm_password = request.form.get('confirm_password')

    if password != confirm_password:
        return make_response("비밀번호가 일치하지 않습니다", 200)
    else:
        usertable = User()
        usertable.userid = userid
        usertable.password = password
        db.session.add(usertable)
        db.session.commit()
        return make_response("회원가입 성공", 200)


@app.route('/register', methods=['POST'])
def good():
    userid = request.form.get('userid')

    password = request.form.get('password')
    confirm_password = request.form.get('confirm_password')
    if password != confirm_password:
        return make_response("비밀번호가 일치하지 않습니다.", 200)
    if not check_password(password):
        return make_response("비밀번호 조합규칙에 맞지 않습니다.", 200)
    else:
        usertable = User()
        usertable.userid = userid
        usertable.password = password
        db.session.add(usertable)
        db.session.commit()
        return make_response("회원가입 성공", 200)


def check_password(password):
    PT1 = re.compile('^(?=.*[A-Z])(?=.*[a-z])[A-Za-z\d!@#$%^&*]{8,}$')
    PT2 = re.compile('^(?=.*[A-Z])(?=.*\d)[A-Za-z\d!@#$%^&*]{8,}$')
    PT3 = re.compile('^(?=.*[A-Z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$')
    PT4 = re.compile('^(?=.*[a-z])(?=.*\d)[A-Za-z\d!@#$%^&*]{8,}$')
    PT5 = re.compile('^(?=.*[a-z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$')
    PT6 = re.compile('^(?=.*\d)(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$')
    PT7 = re.compile('^[A-Za-z\d!@#$%^&*]{10,}$')
    for pattern in [PT1, PT2, PT3, PT4, PT5, PT6, PT7]:
        if pattern.match(password):
            return True
    return False
