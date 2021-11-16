// #include <cstdint> 추가
// 10A3_MUNUSED2__extern.cpp 추가
// main 추가
#include <cstdint>


extern volatile uint16_t v;
extern char* p;

void f(void)
{
	uint16_t x;
	(void)v; /* ComplProject1iant -v is accessed for its side effect
	* and the cast to void is permitted
	* by exception */
	(int32_t)v; /* Non-compliant - the cast operator is dead */
	v >> 3; /* Non-compliant - the ＞＞ operator is dead */
	x = 3; /* Non-compliant - the = operator is dead
	* x is not subsequently read */
	*p++; /* Non-compliant - result of * operator is not used */
	(*p)++; /* Compliant - *p is incremented */
}

int main()
{
	f();

	return 0;
}