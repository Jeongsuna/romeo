#include <stdio.h>

unsigned __int8 u8a = 2;
__int8 s8a = -5;
char cha = 'a';

int fake_main() {
	printf("%c\n", '0' + u8a); /* Convert u8a to digit */
	printf("%c\n", s8a + '0'); /* Convert s8a to digit */
	printf("%c\n", cha - '0'); /* Convert cha to ordinal */
	printf("%c\n", '0' - s8a); /* Convert -s8a to digit */
	return 0;
}