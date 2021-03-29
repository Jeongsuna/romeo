#include <iostream>

#define BUFFER_SIZE 1000

typedef struct {
	char* option1;
} Configuration;

void ReadConfiguration() {
	char buffer[BUFFER_SIZE];
	FILE* fp = fopen("config.cfg", "r");
	Configuration configuration;

	configuration.option1 = "option";

	fgets(buffer, BUFFER_SIZE, fp);
	// fopen, fgets 함수가 실패하여 NULL 포인터가 반환될 경우 의도되지 않은 동작을 할 수 있다.
	strcpy(configuration.option1, buffer);
}
