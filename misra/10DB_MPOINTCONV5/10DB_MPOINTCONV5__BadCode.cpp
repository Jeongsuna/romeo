#include <cstdint>

int main()
{
	uint16_t p16;
	uint32_t *p32;
	void* p;

	p16 = (uint16_t)p;                /* Non-compliant */
	p32 = (uint32_t*)p; /* Non-compliant */
	
	return 0;
}