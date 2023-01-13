from ldap3 import Connection, Server, ALL
from django.shortcuts import render
from ldap3.utils.conv import escape_filter_chars


def bad(request):
    search_keyword = request.POST.get('search_keyword', '')

    address = 'ldap.badSoruce.com'
    server = Server(address, get_info=ALL)

    dn = server.config['bind_dn']
    password = server.config['password']

    conn = Connection(server, user=dn, password=password, auto_bind=True)

    search_str = '(&(objectclass=%s))' % search_keyword

    conn.search('dc=company,dc=com', search_str, attributes=['sn', 'cn', 'address', 'mail', 'mobile', 'uid'])
    return render(request, '/ldap_query_response.html', {'ldap': conn.entries})


def good(request):
    search_keyword = request.POST.get('search_keyword', '')

    address = 'ldap.goodsource.com'
    server = Server(address, get_info=ALL)

    dn = server.config['bind_dn']
    password = server.config['password']

    conn = Connection(server, dn, password, auto_bind=True)

    escpae_keyword = escape_filter_chars(search_keyword)
    search_str = '(&(objectclass=%s))' % escpae_keyword

    conn.search('dc=company,dc=com', search_str, attributes=['sn', 'cn', 'address', 'mail', 'mobile', 'uid'])
    return render(request, '/ldap_query_response.html', {'ldap': conn.entries})
