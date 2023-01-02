from django.db.models import query
from django.shortcuts import render
from lxml import etree


def bad(request):
    user_name = request.POST.get('user_name', '')
    parser = etree.XMLParser(resolve_entities=False)
    tree = etree.parse('user.xml', parser)
    root = tree.getroot()
    path = "/collection/users/user[@name='" + user_name + "']/home/text()"
    elmts = root.xpath(query)
    return render(request, 'parse_xml.html', {'xml_element':elmts})


def good(request):
    user_name = request.POST.get('user_name', '')
    parser = etree.XMLParser(resolve_entities=False)
    tree = etree.parse('user.xml', parser)
    root = tree.getroot()
    query = '/collection/users/user[@name = $paramname]/home/text()'
    elmts = root.xpath(query, paramname=user_name)
    return render(request, 'parse_xml.html', {'xml_element':elmts})