#include <cstdint>

int fake_main()
{
	enum enuma { A1=0, A2, A3 } ena;
	enum enumb { B1=0, B2, B3 } enb;
	uint8_t s8a = 0;
	uint8_t u8a = 0;
	uint8_t u8b = 0;

	s8a += u8a;     /* signed and unsigned */
	u8b + 3;     /* unsigned and signed */

	ena = A1;
	enb = B1;
	if (enb > A1) 
	{ 
		/* enum<enumb> and enum<enuma> */
	}
	else if (ena == enb)
	{
		/* enum<enuma> and enum<enumb> */
	}

	return 0;
}