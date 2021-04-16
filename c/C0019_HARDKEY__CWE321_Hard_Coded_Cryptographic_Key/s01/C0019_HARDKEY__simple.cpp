#include <stdio.h>
#include <stdlib.h>
#include <sql.h>
#include <cstring>
#include <iostream>
#include <unistd.h>

extern char* salt;
int dbaccess(char* user, char* passwd) {
	//char* server = "DBserver";
	char server[] = "DBserver";

	char* cpasswd;
	SQLHENV henv;
	SQLHDBC hdbc;
	SQLAllocHandle(SQL_HANDLE_ENV, SQL_NULL_HANDLE, &henv);
	SQLAllocHandle(SQL_HANDLE_DBC, henv, &hdbc);
	cpasswd = crypt(passwd, salt);

	// 암호화 키가 소스코드내에 상수로 하드코드 되어 있다.
	if (strcmp(cpasswd, "68af404b513073582b6c63e6b") != 0) {
		printf("Incorrect password\n");
		return -1;
	}
	
}
