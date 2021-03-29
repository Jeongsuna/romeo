#include <stdio.h>
#include <string.h>
#include <sql.h>

int C0015_SENDCLEAR() {
	FILE* fp;
	SQLHENV henv;
	char server[] = "DBserver";
	char passwd[20];
	char user[20];

	SQLHDBC hdbc;
	fp = fopen("config", "r");
	fgets(user, sizeof(user), fp);
	//패스워드를 파일에서 읽어 옵니다.
	fgets(passwd, sizeof(passwd), fp);
	fclose(fp);
	SQLAllocHandle(SQL_HANDLE_ENV, SQL_NULL_HANDLE, &henv);
	SQLAllocHandle(SQL_HANDLE_DBC, henv, &hdbc);
	SQLConnect(hdbc,
		(SQLCHAR*)server,
		(SQLSMALLINT)strlen(server),
		(SQLCHAR*)user,
		(SQLSMALLINT)strlen(user),
		//패스워드의 암호화 없이 직접 연결합니다. 
		(SQLCHAR*)passwd,
		(SQLSMALLINT)strlen(passwd));
	return 0;
}
