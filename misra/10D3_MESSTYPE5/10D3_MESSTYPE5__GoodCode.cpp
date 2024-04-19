#include <cstdint>
#define bool_t bool

int fake_main()
{
	enum enuma { A1, A2, A3 } ena;
	enum enumc { C1, C2, C3 } enc;

	(bool_t)false;    /* Compliant - C99 'false' is essentially Boolean */
	(int32_t)3U;      /* Compliant */
	(bool_t)0;       /* Compliant - by exception */
	(int32_t)ena;     /* Compliant */
	(char)enc;        /* Compliant */

	return 0;
}