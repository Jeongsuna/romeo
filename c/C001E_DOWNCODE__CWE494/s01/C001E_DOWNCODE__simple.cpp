#include <iostream>
#include <Winineti.h>
#include <WinInet.h>
#include <cstdio>

#define m_hURL "www.google.com"

void foo() {
	HANDLE hFile;
	int buf_size = 1024;
	LPDWORD dwSize, dwRead, dwWritten;
	DWORD dwRead_s;
	LPVOID IpBuffer;
	int data;

	hFile = CreateFile((LPCWSTR)data, GENERIC_WRITE, 0, NULL, CREATE_ALWAYS, FILE_ATTRIBUTE_NORMAL, NULL);
	InternetQueryDataAvailable(m_hURL, dwSize, 0, 0);
	InternetReadFile(m_hURL, IpBuffer, (DWORD *)dwSize, dwRead);
	WriteFile(hFile, IpBuffer, dwRead_s, dwWritten, NULL);
}
