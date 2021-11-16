// #include <arm64_neon.h> 추가
// #include <stdio.h> 추가
// main() 추가
// 변수 선언
// printf()로 바꿈
// 알 수 없는 오류로 4개는 주석처리함

#include <arm64_neon.h>
#include <stdio.h>

float32_t f32a = 10;
char cha = 'a';
char chb = 'b';
__int8 s8a = 0;
unsigned __int8 u8a = 0;
bool bla = 0;
bool blb = 0;

enum enuma {a1, a2, a3} ena, enb;
enum {K1 = 1, K2 = 2};


int main() {
	//printf("%d", f32a & 2U);
	//printf("%d", f32a MM 2);
	printf("%d", cha && bla);
	printf("%d", ena ? a1 : a2);
	printf("%d", s8a && bla);
	printf("%d", u8a ? a1 : a2);
	printf("%d", f32a && bla);
	printf("%d", bla * blb);
	printf("%d", bla > blb);
	printf("%d", cha & chb);
	printf("%d", cha << 1);
	//printf("%d", ena--);
	printf("%d", ena * a1);
	//printf("%d", ena += a1);
	printf("%d", s8a & 2);
	printf("%d", 50 << 3U);
	printf("%d", u8a << s8a);
	printf("%d", u8a << -1);
	printf("%d", -u8a);
	return 0;
}
