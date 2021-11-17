// #include <cstdint> 추가
// j를 두 번 정의할 수 없으므로, 'int16_t j;'와 'int16_t j = 1;' 중 하나 주석처리
// main() 추가

#include <cstdint>
/* file3.c */
int16_t j; /* Tentative definition */
//int16_t j = 1; /* Compliant - external definition */

int fake_main()
{
	return 0;
}