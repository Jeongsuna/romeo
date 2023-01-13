import os
from flask import Flask
from flask_wtf.csrf import CSRFProtect


def bad():

    app = Flask(__name__)

    return app


def good():

    app = Flask(__name__)
    csrf = CSRFProtect(app)
    app.config['SECRET_KEY'] = os.environ.get('SECRET_KEY')
    csrf.init_app(app)

    return app
