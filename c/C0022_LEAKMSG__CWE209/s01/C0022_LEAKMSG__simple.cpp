#include <iostream>
#include <cstdlib>

int C0022_LEAKMSG(int argc, char* argv[]) {
	char* path = getenv("MYPATH");
	// 공격자가 환경변수에 정의된 파일을 유추할 수 있다.
	try {
		fprintf(stderr, path);
	}
	catch(int expn){
		printf("[%d] 에러 발생", &expn);
	}
	return 0;
}
