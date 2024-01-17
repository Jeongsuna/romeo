#include <stdio.h>
#include <stdint.h>
#include <arm_neon.h>

int16_t s16a = 1;
_Float32 f32a = 1;
char cha = 'a';
char cha5 = '5';
enum enuma { a, b, c } ena;

int main() {
	printf("%c\n", s16a - 'a');
	printf("%c\n", '0' + f32a);
	printf("%c\n", cha + ':');
	printf("%c\n", cha - ena);
	
	printf("%c\n", cha - cha5);
	return 0;
}