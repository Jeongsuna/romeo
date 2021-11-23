/* f.h */
int xyz2 = 0;

/* f.c */
#include <cstdint>

int16_t a2;

#include "f.h"    /* Non-compliant */

/* f1.c */
#define F1_MACRO

#include "f1.h"   /* Compliant */
#include "f2.h"   /* Compliant */

int32_t i2 = 0;

#include "f3.h"   /* Non-compliant */

int fake_main()
{
	return 0;
}
