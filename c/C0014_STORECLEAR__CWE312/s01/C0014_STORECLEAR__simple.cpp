#include <string.h>

char* read_password() {
	char str[50] = "password";
	return str;
}

char* get_password(char* username) {
	char str[50] = "usr_password";
	return str;
}

int C0014_STORECLEAR(char* username) {
	char* password;
	// 사용자 이름에 대한 인증 과정에서 암호를 평문으로 사용하고 있다.
	password = read_password();
	return !strcmp(password, get_password(username));
}
