#include <cstdint>

int fake_main()
{
	uint8_t u8a = 1;
	u8a = u8a << 8;             /* Non-compliant */
	1u << 10u;                   /* Non-compliant */

	return 0;
}
