#include <iostream>

void C000C_TYPEOVER(int argc, char* argv[]) {
	// 외부 입력값을 사용할 때, 입력 값의 크기가 너무 클 경우 오버플로우 발생
	int usr_num = 0;
	char* num_array[] = { "one", "two", "three", "four" };
	char* num = NULL;
	usr_num = atoi(argv[1]);
	num = num_array[usr_num];
}