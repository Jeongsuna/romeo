#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main()
{
    uint32_t *p32;
	uint16_t *p16;
	void* p = NULL;
	uint16_t *p16_null = (uint16_t *) p;    /* Compliant - exception: A null pointer constant that has type pointer to void may be converted into pointer to object */

	p = p32; /* Compliant - pointer to uint32_t into pointer to void */
	p = ( void * ) p16; /* compliant */
}