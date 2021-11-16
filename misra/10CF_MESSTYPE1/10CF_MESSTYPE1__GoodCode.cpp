// #include <arm64_neon.h> 추가
// #include <stdio.h> 추가
// main() 추가
// 변수 선언
// printf()로 바꿈

#include <arm64_neon.h>
#include <stdio.h>

bool bla = 0;
bool blb = 0;

char cha = 'a';
char chb = 'b';

__int8 s8a = 0;
__int8 s8b = 0;
__int16 s16b = 0;

unsigned __int8 u8a = 0;
unsigned __int8 u8b = 0;
unsigned __int16 u16b = 0;

float32_t f32a = 1;
float32_t f32b = 1;

enum enuma {a1, a2, a3} ena, enb;
enum {K1 = 1, K2 = 2};

int main()
{
	printf("%d", bla && blb);
	printf("%d", bla ? u8a : u8b);
	printf("%d", cha - chb);
	printf("%d", cha > chb);
	printf("%d", ena > a1);
	printf("%d", K1 * s8a);
	printf("%d", s8a + s16b);
	printf("%d", -(s8a) * s8b);
	printf("%d", s8a > 0);
	printf("%d", --s16b);
	printf("%d", u8a + u16b);
	printf("%d", u8a & 2U);
	printf("%d", u8a > 0U);
	printf("%d", u8a << 2U);
	printf("%d", u8a << 1);
	printf("%d", f32a + f32b);
	printf("%d", f32a > 0.0);
	printf("%d", cha + chb);
}
