import socket

def is_trust(host_domain_name):
    trusted = False
    trusted_host = "trust.example.com"
    # 공격자에 의해 실행되는 서버의 DNS가 변경될 수 있으므로
    # 안전하지 않다.
    if trusted_host == host_domain_name:
        trusted = True
    return trusted
