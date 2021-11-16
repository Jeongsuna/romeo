#include "stdbool.h"
#include <cstdint>

bool_t f(uint16_t n, char* p)
{
	if (n > 10u)
	{
	}

	if (p == NULL)
	{
	}

	return true;  /* Compliant */
}
int main() {
	f(0, 0);
	return 0;
}