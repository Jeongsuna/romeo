from logging import Handler
from django.shortcuts import render
from xml.sax import make_parser, handler
import os


def parse_xml(request):
    filename = request.POST.get('filename')
    # filename의 None 체크를 하지 않아 에러 발생 가능
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