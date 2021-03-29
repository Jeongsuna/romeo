#include <WinSock2.h>

//vlop
void C000D_RELUNTRUST() {
	int sockfd = socket(PF_INET, SOCK_STREAM, 0);
	char* server_info = getenv("server_addr");
	struct sockaddr_in server_addr;

	memset(&server_addr, 0, sizeof(server_addr));
	server_addr.sin_family = AF_INET;
	server_addr.sin_addr.s_addr = htonl(INADDR_ANY);
	server_addr.sin_port = htons(3500);

	//외부에서 가져온 서버 정보를 그대로 사용한다.
	if (connect(sockfd, (struct sockaddr*)&server_addr, sizeof(struct sockaddr)) < 0) {
		return;
	}
	/*라이선스 검증 코드*/
}