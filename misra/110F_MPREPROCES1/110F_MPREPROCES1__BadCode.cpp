#define F1_MACRO

#include <cstdint>

int16_t a2;

#include "f1.h"    /* Non-compliant */
#include "f2.h"    /* Non-compliant */

int32_t i = 0;

#include "f3.h"    /* Non-compliant */

int fake_main()
{
	return 0;
}
