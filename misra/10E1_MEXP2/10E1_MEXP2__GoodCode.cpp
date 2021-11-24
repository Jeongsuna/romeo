#include <cstdint>

int main()
{
	uint8_t u8a = 1;
	uint16_t u16a = 2;

	u8a = u8a << 7;             /* Compliant */
	u16a = (uint16_t)u8a << 9; /* Compliant */

	(uint16_t)1u << 10u;      /* Compliant */
	1UL << 10u;                  /* Compliant */

	return 0;
}