// include <cstdint> 추가
// main 추가

#include <cstdint>
extern uint16_t speed = 6000u; /* Non-compliant - no declaration
* prior to this definition * /
uint8_t pressure = 101u; /* Non-compliant - no declaration
* prior to this definition */
extern void func3(int16_t x, int16_t y);
void func3(int16_t x, uint16_t y)
{
	/* Non-compliant - parameter types different */
}
void func4(void)
{
	/* Non-compliant - no declaration of func4 before this definition */
}

int main()
{
	return 0;
}