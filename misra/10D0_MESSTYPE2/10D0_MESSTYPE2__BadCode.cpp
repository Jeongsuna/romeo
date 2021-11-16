#include <stdio.h>
#include <arm_neon.h>

__int16 s16a = 1;
float32_t f32a = 1;
char cha = 'a';
enum enuma { a, b, c } ena;

int main() {
	printf("%c\n", s16a - 'a');
	printf("%c\n", '0' + f32a);
	printf("%c\n", cha + ':');
	printf("%c\n", cha - ena);
	return 0;
}