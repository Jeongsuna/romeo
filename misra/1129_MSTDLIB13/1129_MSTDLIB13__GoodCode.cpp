#include <cstdint>
#include "stdbool.h"
#include <ctype.h>
#include <cstdio>

bool_t f(uint8_t a)
{
	return (isdigit((int32_t)a)     /* Compliant */
		&& isalpha((int32_t) 'b')   /* Compliant */
		&& islower(EOF));   /* Compliant */
}
int main() {
	f(0);
	return 0;
}