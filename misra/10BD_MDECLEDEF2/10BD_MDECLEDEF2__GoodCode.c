// #include <arm64_neon.h> 추가
// main() 추가
// 10BD_MDECLEDEF2__extern.c 추가

#include <arm64_neon.h>

/* Compliant */
extern int16_t func1(int16_t n);
/* Compliant - prototype specifies 0 parameters */
static int16_t func4(void);
/* Compliant */
int16_t func1(int16_t n)
{
	return n;
}
/* Compliant - prototype specifies 0 parameters */
int16_t(*pf1) (void);
/* Compliant */
typedef int16_t(*pf3_t) (int16_t n);

int fake_main()
{
	return 0;
}