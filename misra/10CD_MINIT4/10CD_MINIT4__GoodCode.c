// #include <arm64_neon.h> �߰�
// #include <stdio.h> �߰�
// main() �߰�

#include <arm_neon.h>
#include <stdint.h>

/* 
 * Required behaviour using positional initialization
 * Compliant - a1 is - 5, -4, -3, -2, -1 
 */
int16_t a1[5] = { -5, -4, -3, -2, -1 };

/*
 * Similar behaviour using designated initializers
 * Compliant - a2 is -5, -4, -3, -2, -1 
 */
int16_t a2[5] = { [0] = -5, [1] = -4, [2] = -3, [3] = -2,[4] = -1 };

struct mystruct
{
	int32_t a;
	int32_t b;
	int32_t c;
	int32_t d;
};
/* 
 * Required behaviour using positional initialization
 * Compliant - s1 is 100, -1, 42, 999 
 */
struct mystruct s1 = { 100, -1, 42, 999 };
/* 
 * Similar behaviour using designated initializers
 * Compliant - s2 is 100, -1, 42, 999 
 */
struct mystruct s2 = { .a = 100, .b = -1, .c = 42, .d = 999 };

int fake_main()
{
	return 0;
}