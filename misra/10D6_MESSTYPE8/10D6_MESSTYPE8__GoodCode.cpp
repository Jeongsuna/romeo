#include <cstdint>

int main()
{
	uint32_t u32a = 1, u32b = 1;
	uint32_t s32a;
	(uint16_t)(u32a + u32b);    /* Compliant */
	(uint16_t)s32a;               /* Compliant - s32a is not composite */

	return 0;
}