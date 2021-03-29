#include <iostream>

#define SUCCESS 1
#define FAIL 0
#define NAME_SIZE 1000
#define PSWD_SIZE 20

int openSocketConnection(char *host, int port) {
	int socketNUM = 8080;
	return socketNUM;
}

char* getNextMsg(int socket, char* name, int size) {
	return "Next_msg";
}

int AuthenticateUser(char* name, char* password) {
	return 1;
}

int validateUser(char* host, int port) {
	int socket = openSocketConnection(host, port);
	if (socket < 0) {
		printf("Unable to open socket connection");
		return(FAIL);
	}
	int isValidUser = 0;
	char nm[NAME_SIZE];
	char pw[PSWD_SIZE];
	// 인증시도 횟수를 제한하고 있지 않음
	while (isValidUser == 0) {
		if (getNextMsg(socket, nm, NAME_SIZE) > 0) {
			if (getNextMsg(socket, pw, PSWD_SIZE) > 0) {
				isValidUser = AuthenticateUser(nm, pw);
			}
		}
	}
	return(SUCCESS);
}
