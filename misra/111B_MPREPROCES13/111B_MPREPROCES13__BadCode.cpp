#include <cstdint>
#define AAA 2

int32_t foo(void)
{
	int32_t x = 0;

#ifndef AAA
	x = 1;
	#else1        /* Non-compliant */
		x = AAA;
#endif

	return x;
}

int fake_main()
{
	return 0;
}