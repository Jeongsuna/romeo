#include <stdlib.h>

int CWE209_Information_Leak_Error__getenv_fprintf_01_bad(int argc, char* argv[]) {
	char *path = getenv("MYPATH");
	/* 공격자가 환경변수에 정의된 파일을 유추할 수 있다.*/
	printf("path: %s\n", path);
	return 0;
}
