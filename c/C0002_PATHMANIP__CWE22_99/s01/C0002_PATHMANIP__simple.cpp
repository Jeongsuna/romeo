#pragma comment(lib,"ws2_32")
#include <WinSock2.h>
#include <iostream>
#include <cstdlib>

#define buf filename
#define BUF_LEN 1000

int main() {
	// �ܺ� �����͸� �Է¹޴´�.
	char* filename = getenv("reportfile");
	FILE* fin = NULL;
	//�ܺ� ���� ������ ���� ���� �̸��� �״�� ����Ѵ�
	fin = fopen(filename, "r");
	while (fgets(buf, BUF_LEN, fin)) {
		//���� ���� ���
		printf("���� ���� ���");
	}

	//2019
	char* rPort = getenv("rPort");
	struct sockaddr_in serv_addr;
	int sockfd = 0;

	// �Է¹��� ������ ������ �����Ѵ�.
	serv_addr.sin_port = htons(atoi(rPort));
	if (connect(sockfd, (struct sockaddr*)&serv_addr, sizeof(serv_addr)) < 0) {
		exit(1);
	}
	return 0;
}