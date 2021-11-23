#include <cstdint>

uint16_t func2(uint16_t paral)
{
	return paral;
}

uint16_t x1;

void discarded2(uint16_t para2)
{
	func2(para2);            /* Non-compliant - value discarded */
}

int fake_main()
{
	x1 = 1;
	discarded2(x1);
	return 0;
}