// #include <arm64_neon.h> 추가
// uint16_t* p; 위치 조정
// [0]과 같은 형식 앞에 a3 추가
// .a와 같은 형식 앞에 s3 추가
// main() 추가

#include <arm64_neon.h>

uint16_t* q;

void f ( void )
{

	uint16_t a[2] = { a[0] = *q++,a[0] = 1 };
}
/* Repeated designated initializer element values overwrite earlier ones
* Non-compliant - a3 is -5, -4, -2, 0, -1 */
int16_t a3[5] = { a3[0] = -5,a3[1] = -4,a3[2] = -3,a3[2] = -2,a3[4] = -1 };

struct mystruct
{
	int32_t a;
	int32_t b;
	int32_t c;
	int32_t d;
};
/* Repeated designated initializer element values overwrite earlier ones
* Non-compliant - s3 is 42, -1, 0, 999 */
struct mystruct s3 = { s3.a = 100, s3.b = -1, s3.a = 42, s3.d = 999 };

int main()
{
	return 0;
}