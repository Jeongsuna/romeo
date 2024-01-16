#include <stdint.h>
#include <stddef.h>
#include <stdbool.h>

void fake_main()
{
    uint32_t *p32;
	uint16_t *p16;
	void* p;

	p = p32;

	p16 = p;                /* Non-compliant */
	p32 = (uint32_t*)p; /* Non-compliant */
}