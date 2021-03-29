#include <iostream>

#define BUF_SIZE 5000

bool checkSomething() {
	return false;
}

void ImproperResourceRelease(char* filename) {
	char buf[BUF_SIZE];
	FILE* f = fopen(filename, "r");
	if (!checkSomething()) {
		printf("Something is wrong");
		return;
	}
	//chekSomething에서 false를 반환하는 경우, 파일 핸들러를 종료할 수 없습니다.
	fclose(f);
}
