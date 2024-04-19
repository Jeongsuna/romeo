#include <cstdint>

uint16_t f(uint16_t y)
{
	/* These side effects are not persistent as seen by the caller */
	uint16_t temp = y;

	temp = y + 0x8080U;

	return temp;
}

void g(void)
{
	int ishigh = 0;
	int a = 1; 
	uint16_t x = 1;

	/* Compliant - f ( ) has no persistent side effects */
	if (ishigh && (a == f(x)))
	{
	}
}

int main()
{
	return 0;
}