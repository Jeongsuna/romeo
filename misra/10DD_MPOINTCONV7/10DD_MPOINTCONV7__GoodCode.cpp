#include <cstdint>
#include <arm64_neon.h>

int main()
{
	int16_t pp;
	int16_t* p = &pp;  /* Compliant */

	float32_t f;
	float32_t* ff = &f; /* Compliant */

	return 0;
}