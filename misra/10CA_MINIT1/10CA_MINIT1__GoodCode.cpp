#include "stdbool.h"
#include <cstdint>

void f2(bool_t b, uint16_t* p)
{
	if (b)
	{
		*p = 3U;
	}
}
void g2(void)
{
	uint16_t u;
	f2(false, &u);
	if (u == 3U)
	{
		/* Non-compliant - u has not been assigned a value */
	}
	{
		uint16_t x = 10u;
		x = x + 1u;
	}
}
int fake_main() {
	g2();
	return 0;
}