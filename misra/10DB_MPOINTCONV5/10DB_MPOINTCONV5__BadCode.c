typedef unsigned short uint16_t;
typedef unsigned int uint32_t;

int fake_main()
{
	uint16_t p16;
	uint32_t *p32;
	void* p = 0;

	p16 = p;                /* Non-compliant */
	p32 = (uint32_t*)p; /* Non-compliant */
	
	return 0;
}

