#include <cstdint>

int main() {

	unsigned __int16 u16a = 1u;
	__int8 s8a;

	s8a = (u16a < 0u) ? 0 : 1;      /* Non-compliant - u16a always >= 0 */

	if (u16a <= 0xffffu)
	{
		/* Non-compliant - always true */
	}

	if (2 > 3)
	{
		/* Non-compliant - always false */
	}

	for (s8a = 0; s8a < 130; ++s8a)
	{
		/* Non-compliant - always true */
	}

	if ((s8a < 10) && (s8a > 20))
	{
		/* Non-compliant - always false */
	}

	if ((s8a < 10) || (s8a > 5))
	{
		/* Non-compliant - always true */
	}

	while (s8a > 10)
	{
		if (s8a > 5)
		{
			/* Non-compliant - s8a not volatile */
		}
	}

	const uint8_t numcy1 = 4u;
	/*
	 * Non-compliant - compiler is permitted to assume that numcy1 always
	 * has value 4 */
	if (numcy1 == 4u)
	{
	}

	uint16_t n = 20;     /* 10 <= n <= 100 */
	uint16_t sum;

	sum = 0;

	for (uint16_t i = (n - 6u); i < n; ++i)
	{
		sum += i;
	}

	if ((sum % 2u) == 0u)
	{
		/*
		 * Non-compliant - sum is the sum of 6 consecutive non-negative
		 * integers so must be an odd number. The controlling expression
		 * of the if statement will always be fasle. */
	 }
	return 0;
}