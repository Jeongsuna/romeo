// #include <cstdint> �߰�
// 10A3_MUNUSED2__extern.cpp �߰�
// main �߰�
#include <cstdint>


extern volatile uint16_t v;
extern char* q;

void f(void)
{
	uint16_t x;
	(void)v; /* ComplProject1iant -v is accessed for its side effect
	* and the cast to void is permitted
	* by exception */
	(int32_t)v; /* Non-compliant - the cast operator is dead */
	v >> 3; /* Non-compliant - the ���� operator is dead */
	x = 3; /* Non-compliant - the = operator is dead
	* x is not subsequently read */
	*q++; /* Non-compliant - result of * operator is not used */
	(*q)++; /* Compliant - *p is incremented */
}

int main()
{
	f();

	return 0;
}