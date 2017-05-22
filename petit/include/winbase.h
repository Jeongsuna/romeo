#include <wincrypt.h>

#define LOGON32_LOGON_NETWORK           3
#define LOGON32_PROVIDER_DEFAULT    0

BOOL LogonUserA(LPCSTR lpszUsername, LPCSTR lpszDomain, LPCSTR lpszPassword, DWORD dwLogonType, DWORD dwLogonProvider, HANDLE* phToken);

BOOL CloseHandle(HANDLE hObject);
void* SecureZeroMemory(void* ptr, size_t cnt);