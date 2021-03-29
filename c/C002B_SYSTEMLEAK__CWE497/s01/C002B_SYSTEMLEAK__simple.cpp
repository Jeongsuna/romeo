#include <iostream>
#include <stdio.h>

void C002B_SYSTEMLAEAK() {
	FILE* fp = fopen("config.cfg", "r");
	char* path = getenv("PATH");

	if (fp = fopen(path, "r")) {
		printf("file activity");
	}
	else {
		//오류 발생시 path 경로를 노출해 다른 공격의 빌미를 제공한다.
		fprintf(stderr, "cannot find exe on path %s\n", path);
	}
}
