#include <cstdint>

uint16_t func(uint16_t paral)
{
	return paral;
}

uint16_t x;

void discarded(uint16_t para2)
{
	func(para2);            /* Non-compliant - value discarded */
}

int main()
{
	x = 1;
	discarded(x);
	return 0;
}