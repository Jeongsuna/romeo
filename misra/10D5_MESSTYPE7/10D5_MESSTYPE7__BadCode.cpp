#include <cstdint>

int fake_main()
{
	uint16_t u16a = 1, u16b = 2;
	uint32_t u32a = 3;

	u32a* (u16a + u16b);        /* Implicit conversion of ( u16a + u16b ) */
	u32a += (u16a + u16b);        /* Implicit conversion of ( u16a + u16b ) */

	return 0;
}