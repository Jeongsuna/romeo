#pragma once
#ifndef __RCRYPTUTIL_H__
#define __RCRYPTUTIL_H__

#include <windows.h>
#include <wincrypt.h>

LPSTR RMD5Encrypt(LPCSTR lpszKey, LPCSTR lpszSalt);

#endif // #ifndef __RCRYPTUTIL_H__
