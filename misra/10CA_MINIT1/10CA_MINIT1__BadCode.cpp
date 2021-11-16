#include "stdbool.h"
#include <cstdint>

void f(bool_t b, uint16_t* p)
{
	if (b)
	{
		*p = 3U;
	}
}
void g(void)
{
	uint16_t u;
	f(false, &u);
	if (u == 3U)
	{
		/* Non-compliant - u has not been assigned a value */
	}
	{
		//goto L1;
		uint16_t x = 10u;
	L1:
		x = x + 1u;
	}
}
int main() {
	g();
	return 0;
}