// #include <arm64_neon.h> �߰�
// uint16_t* p; ��ġ ����
// [0]�� ���� ���� �տ� a3 �߰�
// .a�� ���� ���� �տ� s3 �߰�
// main() �߰�

#include <arm_neon.h>
#include <stdint.h>

uint16_t* q;

void f ( void )
{

	/*
	 * non-compliant - it is unspecified whether the side effect occurs or not.
	 */
	uint16_t a[2] = { a[0] = *q++, a[1] = 1 };
}
/* 
 * Repeated designated initializer element values overwrite earlier ones
 * Non-compliant - a3 is -5, -4, -2, 0, -1 
 */
int16_t a_bad[5] = { a_bad[0] = -5, a_bad[1] = -4, a_bad[2] = -3, a_bad[2] = -2, a_bad[4] = -1 };

struct mystruct
{
	int32_t a;
	int32_t b;
	int32_t c;
	int32_t d;
};
/* 
 * Repeated designated initializer element values overwrite earlier ones
 * Non-compliant - s3 is 42, -1, 0, 999 
 */
struct mystruct s3 = { s3.a = 100, s3.b = -1, s3.a = 42, s3.d = 999 };

int main()
{
	return 0;
}