import socket

def is_trust(host_domain_name):
    trusted = False
    trusted_ip = "192.168.10.7"
    # 실제 서버의 IP 주소를 비교하여 DNS 변조에 대응
    dns_resolved_ip = socket.gethostbyaddr(host_domain_name)

    if trusted_ip == dns_resolved_ip:
        trusted = True

    return trusted
