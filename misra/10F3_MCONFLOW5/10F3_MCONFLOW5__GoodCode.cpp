#include "stdbool.h"
#include <cstdint>

bool_t f2(uint16_t n, char* p)
{
	if (n > 10u)
	{
	}

	if (p == NULL)
	{
	}

	return true;  /* Compliant */
}
int fake_main() {
	f2(0, 0);
	return 0;
}