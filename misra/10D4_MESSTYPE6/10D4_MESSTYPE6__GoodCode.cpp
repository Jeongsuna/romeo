#include <cstdint>

int main()
{
	uint16_t u16a = 1, u16b = 2, u16c;
	uint32_t u32a;
	u16c = u16a + u16b;                 /* Same essential type */
	u32a = (uint32_t)u16a + u16b;  /* Cast causes addition in uint32_t */

	return 0;
}