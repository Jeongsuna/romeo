#include <cstdint>

int main()
{
	enum enuma { A1=1, A2=0, A3 } ena;
	enum enumb { B1, B2=0, B3 } enb;
	uint8_t s8a = 0;
	uint8_t u8a = 0;
	uint8_t u8b = 0;
	uint16_t u16b = 0;
	char chat = 0, cha = 0;

	ena = A2;
	enb = B2;
	if (ena > A1)
	{
		u8a + u16b;

		chat += u8a;

		u8a += cha;  /* unsigned and char */
	}

	return 0;
}