#include <cstring>
#include <iostream>
#define EQUAL 1
#define MAX_QUERY_LENGTH 100

char* GetParameter(char query, std::string command) {
	return 0;
}

void SQLExecDirect(int statmentHandle, char* query, const char* SQL_NTS) {
	printf("SQLExecDirect");
}

void C0001_SQLI() {
	// 입력값을 가져온다.
	char queryStr = 0;
	const char* GET_USER_INFO_CMD = 0;
	const char* SQL_NTS = 0;
	std::string USER_ID_PARAM = 0, PASSWORD_PARAM = 0;
	int statmentHandle = 0;

	char* command = GetParameter(queryStr, "command");

	if (strcmp(command, GET_USER_INFO_CMD) == EQUAL) {
		// userId 와 password값을 가져온다.
		const char* userId = GetParameter(queryStr, USER_ID_PARAM);
		const char* password = GetParameter(queryStr, PASSWORD_PARAM);

		char query[MAX_QUERY_LENGTH];
		// 입력값을 그대로 SQL쿼리에 사용하고 있다.
		sprintf(query,
			"SELECT * FROM members WHERE username= ' %s ' AND password =' %s '",
			userId, password);
		SQLExecDirect(statmentHandle, query, SQL_NTS);
	}
}
