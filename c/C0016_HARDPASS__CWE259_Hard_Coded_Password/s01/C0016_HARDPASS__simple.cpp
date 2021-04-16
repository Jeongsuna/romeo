#include <stdio.h>
#include <sql.h>
#include <string.h>

int dbaccess(char* server, char* user) {
	SQLHENV henv;
	SQLHDBC hdbc;
	char str[50] = "password";
	char* password = str;

	SQLAllocHandle(SQL_HANDLE_ENV, SQL_NULL_HANDLE, &henv);
	SQLAllocHandle(SQL_HANDLE_DBC, henv, &hdbc);
	//하드코드된 패스워드를 사용
	SQLConnect(hdbc, (SQLCHAR*)server, strlen(server), (SQLCHAR *)user, strlen(user), (SQLCHAR *)password, strlen(password));

	return 0;
}
