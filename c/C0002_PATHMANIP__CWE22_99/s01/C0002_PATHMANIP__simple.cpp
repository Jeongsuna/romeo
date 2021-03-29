#pragma comment(lib,"ws2_32")
#include <WinSock2.h>
#include <iostream>
#include <cstdlib>

#define buf filename
#define BUF_LEN 1000

int main() {
	// 외부 데이터를 입력받는다.
	char* filename = getenv("reportfile");
	FILE* fin = NULL;
	//외부 설정 값에서 받은 파일 이름을 그대로 사용한다
	fin = fopen(filename, "r");
	while (fgets(buf, BUF_LEN, fin)) {
		//파일 내용 출력
		printf("파일 내용 출력");
	}

	//2019
	char* rPort = getenv("rPort");
	struct sockaddr_in serv_addr;
	int sockfd = 0;

	// 입력받은 값으로 소켓을 생성한다.
	serv_addr.sin_port = htons(atoi(rPort));
	if (connect(sockfd, (struct sockaddr*)&serv_addr, sizeof(serv_addr)) < 0) {
		exit(1);
	}
	return 0;
}