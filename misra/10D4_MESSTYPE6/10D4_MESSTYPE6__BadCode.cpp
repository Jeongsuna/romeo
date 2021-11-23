#include <cstdint>

uint32_t use_uint32(uint16_t x, uint16_t y)
{
	return (uint32_t)(x + y);
}

int fake_main()
{
	uint16_t u16a = 1, u16b = 2;
	uint32_t u32c;
	u32c = u16a + u16b;                 /* Implicit conversion on assignment */
	use_uint32(u16a, u16b);      /* Implicit conversion of fn argument */
	
	return 0;
}