#include <cstdint>
#include <arm64_neon.h>

int fake_main() 
{
	int16_t* p;
	float32_t f = 1.1;

	p = (int16_t*&)f;     /* Non-compliant */
	f = (float32_t&)p;   /* Non-compliant */

	return 0;
}