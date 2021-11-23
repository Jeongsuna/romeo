#include <cstdint>
#define bool_t bool

int main()
{
	(bool_t)3U;           /* Non-compliant */
	(enum enuma)3;        /* Non-compliant */

	return 0;
}