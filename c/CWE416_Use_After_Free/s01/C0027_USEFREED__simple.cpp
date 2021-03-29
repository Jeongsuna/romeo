#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFER_SIZE 100

void C0027_USERFREED(int argc, const char* argv[]) {
	char* temp;

	temp = (char*)malloc(BUFFER_SIZE);
	free(temp);
	//해제된 자원을 사용하고 있어 의도하지 않은 결과가 발생하게 된다.
	strncpy(temp, argv[1], BUFFER_SIZE - 1);
}
