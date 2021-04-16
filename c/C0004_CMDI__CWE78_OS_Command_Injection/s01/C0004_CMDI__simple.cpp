#include <stdio.h>
#include <stdlib.h>

#define CMD_LENGTH 100

char *cmd_data;

void C0004_CMDI(int argc, char* argv[]) {
	char cmd[CMD_LENGTH];
	if (argc < 1 ){
		//error
	}
	//외부 입력값으로 커맨드를 직접 수행
	cmd_data = argv[1];
	snprintf(cmd, CMD_LENGTH, "cat %s", cmd_data);
	
	//flaw
	system(cmd);
}