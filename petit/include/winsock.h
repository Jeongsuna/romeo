#ifndef _WINSOCK_H
#define _WINSOCK_H

#include <windef.h>
#include <winsock2.h>

#define AF_INET         2               /* internetwork: UDP, TCP, etc. */
#define PF_INET         AF_INET

#define IPPROTO_TCP             6               /* tcp */

#define SOCK_STREAM     1               /* stream socket */

#define INADDR_ANY              (unsigned long)0x00000000

struct  hostent {
        char* h_name;           /* official name of host */
        char** h_aliases;  /* alias list */
        short h_addrtype;             /* host address type */
        short h_length;               /* length of address */
        char** h_addr_list; /* list of addresses */
#define h_addr  h_addr_list[0]          /* address, for backward compat */
};

typedef WSADATA* LPWSADATA;
int WSAStartup(WORD wVersionRequired, LPWSADATA lpWSAData);
int WSACleanup(void);
SOCKET socket(int af, int type, int protocol);
unsigned long inet_addr(const char* cp);
unsigned short htons(unsigned short hostshort);
int connect(SOCKET s, void* name, int namelen);
int recv(SOCKET s, char* buf, int len, int flags);
int closesocket(SOCKET s);

#endif