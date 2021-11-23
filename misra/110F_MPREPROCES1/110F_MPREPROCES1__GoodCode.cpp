#include <cstdint>
/* f.h */
int16_t xyz = 0;

/* f.c */
#include "f.h"    /* Compliant */

int16_t a;

/* f1.c */
#define F1_MACRO

#include "f1.h"   /* Compliant */
#include "f2.h"   /* Compliant */
#include "f3.h"   /* Compliant */

int32_t i = 0;

int main() 
{
	return 0;
}
