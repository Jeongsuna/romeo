// include <cstdint> 추가
// main 추가

#include <cstdint>
extern int16_t count;
int16_t count = 0; /* Compliant */
extern void func1(void);
extern void func2(int16_t x, int16_t y);
void func1(void)
{
	/* Compliant */
}
void func2(int16_t x, int16_t y)
{
	/* Compliant */
}
static void func5(void)
{
	/* Compliant - rule does not apply to objects/functions with internal
	* linkage */
}

int fake_main()
{
	return 0;
}