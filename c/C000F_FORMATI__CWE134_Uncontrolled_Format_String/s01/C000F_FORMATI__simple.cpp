#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void incorrect_password(const char* user) {
	static const char msg_format[] = "%s cannot be authenticated.\n";
	size_t len = strlen(user) + sizeof(msg_format);
	char* msg = (char*)malloc(len);
	if (msg == NULL) {
		/* 오류 처리 */
	}
	int ret = snprintf(msg, len, msg_format, user);
	if (ret < 0 || ret >= len) {
		/* 오류 처리 */
	}
	
	fprintf(stderr, msg);
	free(msg);
	msg = NULL;
}
