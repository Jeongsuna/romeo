// #include <arm64_neon.h> 추가
// #include <stdio.h> 추가
// main() 추가
// 변수 선언
// printf()로 바꿈

#include <arm64_neon.h>
#include <stdio.h>

bool bla2 = 0;
bool blb2 = 0;

char cha2 = 'a';
char chb2 = 'b';

__int8 s8a2 = 0;
__int8 s8b2 = 0;
__int16 s16b2 = 0;

unsigned __int8 u8a2 = 0;
unsigned __int8 u8b2 = 0;
unsigned __int16 u16b2 = 0;

float32_t f32a2 = 1;
float32_t f32b2 = 1;

enum enuma {a1, a2, a3} ena2, enb2;
enum {K1 = 1, K2 = 2};

int fake_main()
{
	printf("%d", bla2 && blb2);
	printf("%d", bla2 ? u8a2 : u8b2);
	printf("%d", cha2 - chb2);
	printf("%d", cha2 > chb2);
	printf("%d", ena2 > a1);
	printf("%d", K1 * s8a2);
	printf("%d", s8a2 + s16b2);
	printf("%d", -(s8a2) * s8b2);
	printf("%d", s8a2 > 0);
	printf("%d", --s16b2);
	printf("%d", u8a2 + u16b2);
	printf("%d", u8a2 & 2U);
	printf("%d", u8a2 > 0U);
	printf("%d", u8a2 << 2U);
	printf("%d", u8a2 << 1);
	printf("%d", f32a2 + f32b2);
	printf("%d", f32a2 > 0.0);
	printf("%d", cha2 + chb2);
	return 0;
}
