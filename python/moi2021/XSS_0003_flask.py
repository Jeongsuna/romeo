import html
from flask import Flask, request, render_template, app


@app.route('/search', methods=['POST'])
def bad():
    search_keyword = request.form.get('search_keyword')
    return render_template('search.html', search_keyword=search_keyword)


@app.route('/search', methods=['POST'])
def good():
    search_keyword = request.form.get('search_keyword')
    escape_keyword = html.escape(search_keyword)
    return render_template('search.html', search_keyword=escape_keyword)
