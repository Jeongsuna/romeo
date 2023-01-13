from xml.sax import make_parser
from xml.sax.handler import feature_external_ges
from xml.dom.pulldom import parseString, START_ELEMENT
from django.shortcuts import render
from .models import comments


def bad(request):
    if request.method == "GET":
        data = comments.objects.all()
        com = data[0].comment
        return render(request, '/xml_view.html', {'com': com})
    elif request.method == "POST":
        parser = make_parser()
        parser.setFeature(feature_external_ges, True)
        doc = parseString(request.body.decode('utf-8'), parser=parser)
        for event, node in doc:
            if event == START_ELEMENT and node.tagName == "foo":
                doc.expandNode(node)
                text = node.toxml()
        comments.objects.filter(id=1).update(comment=text)
        return render(request, '/xml_view.html')


def good(request):
    if request.method == "GET":
        data = comments.objects.all()
        com = data[0].comment
        return render(request, '/xml_view.html', {'com': com})
    elif request.method == "POST":
        parser = make_parser()
        parser.setFeature(feature_external_ges, False)
        doc = parseString(request.body.decode('utf-8'), parser=parser)
        for event, node in doc:
            if event == START_ELEMENT and node.tagName == "foo":
                doc.expandNode(node)
                text = node.toxml()
        comments.objects.filter(id=1).update(comment=text);
        return render(request, '/xml_view.html')
