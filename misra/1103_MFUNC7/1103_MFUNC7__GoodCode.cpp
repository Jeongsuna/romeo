#include <cstdint>

uint16_t func(uint16_t paral)
{
	return paral;
}

uint16_t x;

uint16_t discarded(uint16_t para2)
{
	return func(para2);            /* Compliant */
}

int main()
{
	x = 1;
	discarded(x);
	return 0;
}