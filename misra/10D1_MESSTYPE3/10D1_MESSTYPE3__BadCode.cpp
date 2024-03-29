#include <cstdint>
#define bool_t bool

uint16_t use_uint16(uint32_t x)
{
	return x; /* uint32_t to uint16_t */
}

uint32_t use_uint32(int32_t x)
{
	return x; /* uint16_t to uint32_t*/
}

int main()
{
	enum enuma
	{
		A1,
		A2,
		A3
	} ena;
	enum enumb
	{
		B1,
		B2,
		B3
	} enb;
	enum
	{
		K1 = 1,
		K2 = 128
	};
	uint8_t u8a = 1.0f; /* unsigned and floating */
	uint8_t u8b;
	uint8_t u8c = 2;
	uint16_t u16a;
	uint32_t u32a;
	int32_t s32a = 10;

	bool_t bla = 0; /* boolean and signed */
	char cha;

	cha = 7;		  /* character and signed */
	u8a = 'a';		  /* unsigned and character */
	u8a = -1;		  /* unsigned and signed */
	u8b = 1 - 2;	  /* unsigned and signed */
	u8c += 'a';		  /* u8c = u8c + 'a' assigns character to unsigned */
	use_uint32(s32a); /* signed and unsigned */

	int8_t s8a;

	s8a = K2;	 /* Constant value does not fit */
	u16a = u32a; /* uint32_t to uint16_t */

	use_uint16(u32a); /* uint32_t to uint16_t */

	return 0;
}
