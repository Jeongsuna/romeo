from logging import Handler
from django.shortcuts import render
from xml.sax import make_parser, handler
import os


def parse_xml(request):
    filename = request.POST.get('filename')
    # filename None 이 인지 체크
    if filename is None or filename.strip() == "":
        raise ValueError("파일 이름이 없습니다.")

    if (filename.count('.') > 0):
        name, ext = os.path.splitext(filename)
    else:
        ext = ''
    if ext == '.xml':
        parser = make_parser()

    sax_handler = Handler()
    parser.setContentHandler(sax_handler)
    parser.parse(filename)

    return sax_handler.root