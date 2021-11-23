#include <cstdint>

void g(uint16_t x, uint16_t y)
{
	/* Compliant - no side effects */
	uint16_t a[2] = { x + y, x - y };
}

int main()
{
	return 0;
}