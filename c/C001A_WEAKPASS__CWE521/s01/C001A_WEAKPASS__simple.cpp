#include <stdlib.h>
#include <mysql.h>

bool authentication(char* id, char* pwd) {
	MYSQL* connectInstance;
	connectInstance = mysql_init(NULL);
	//패스워드 값에 대한 검증없이 사용합니다.
	mysql_real_connect(connectInstance, "192.168.100.211", id, pwd, "database", 0, NULL, 0);
}
