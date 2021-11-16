// #include <arm64_neon.h> 추가
// main() 추가
// 10BD_MDECLEDEF2__extern.c 추가

#include <arm64_neon.h>

/* Non-compliant - parameter name not specified */
extern void func2(int16_t);
/* Non-compliant - not in prototype form */
static int16_t func3();
/* Non-compliant - old style identifier and declaration list */
static int16_t func3(vec, n)
int16_t* vec;
int16_t n;
{
	return vec[n - 1];
}
/* Non-compliant - no prototype */
int16_t(*pf1) ();
/* Non-compliant - parameter name not specified */
typedef int16_t(*pf2_t) (int16_t);

int main()
{
	return 0;
}