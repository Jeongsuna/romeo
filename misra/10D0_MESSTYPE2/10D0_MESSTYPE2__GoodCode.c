#include <stdio.h>
#include <stdint.h>

uint8_t u8a = 2;
int8_t s8a = 5;
char cha = 'a';
int8_t s8a10 = 10;

int fake_main() {
	printf("%c\n", '0' + u8a); /* Convert u8a to digit */
	printf("%c\n", s8a + '0'); /* Convert s8a to digit */
	printf("%c\n", cha - '0'); /* Convert cha to ordinal */
	printf("%c\n", '0' - s8a); /* Convert -s8a to digit */

	printf("%c\n", cha - s8a10); 
	return 0;
}