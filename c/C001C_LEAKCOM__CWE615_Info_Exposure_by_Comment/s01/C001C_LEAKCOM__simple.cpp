#include <stdlib.h>
#include <string.h>
#include <stdio.h>

// 주석문안에 패스워드가 포함되어 있다.
// default password is "abracadabra"
char* verifyAuth(char* ipasswd, char* orgpasswd) {
	char *admin = "admin";

	if (strncmp(ipasswd, orgpasswd, sizeof(ipasswd)) != 0) {
		printf("Authetication Fail!\n");
	}
	return admin;
}
