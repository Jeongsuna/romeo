#include <cstdint>
#define bool_t bool

int main()
{
	enum enuma { A1, A2, A3 } ena;
	enum enumb { B1, B2, B3 } enb;
	enum { K1 = 1, K2 = 128 };

	uint8_t u8a = 0;  /* By exception */
	uint8_t u8b = 1;
	uint8_t u8c = 2;

	bool_t flag = (bool_t)0;
	bool_t set = true;
	bool_t get = (u8b > u8c);

	uint8_t s8a;
	char cha = 'a';

	ena = A1;
	s8a = K1;       /* Constant value fits */
	u8a = 2;        /* By exception */
	u8a = 2 * 24;   /* By exception */
	cha += 1;       /* cha = cha + 1 assigns character to character */

	uint8_t pu8a = 0;
	uint8_t pu8b = 0;
	uint8_t u8d = 3;

	pu8a = pu8b;            /* Same essential type */
	u8a = u8b + u8c + u8d;  /* Same essential type */
	u8a = (uint8_t)s8a;  /* Cast gives same essential type */
	
	return 0;
}