#include <iostream>
#include <string>
template<typename T>
void printLine(T&& x) { std::cout << x << std::endl; }
int GetUntrustedOffset() {
	return 0;
}

int C000E_BUFOVER(int argc, char** argv) {
	char* items[] = { "boat", "car", "truck", "train" };
	int index = GetUntrustedOffset();
	// 검증되지 않은 값을 배열의 인덱스로 사용하고 있다.
	printf("You selected %s\n", items[index - 1]);
	
	return 0;
}
typedef struct _charvoid {
	char x[16];
	void* y;
	void* z;
} charvoid;

void badCode() {
	charvoid cv_struct;
	char SRC_STR[] = "0";
	cv_struct.y = (void*) SRC_STR;

	printLine((char*)cv_struct.y);
	/* sizeof(cv_struct)의 사용으로 포인터 y에 덮어쓰기 발생 */

	memcpy(cv_struct.x, SRC_STR, sizeof(cv_struct));
	printLine((char*)cv_struct.x);
	printLine((char*)cv_struct.y);
}
