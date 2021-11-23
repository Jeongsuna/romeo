#include <cstdint>

int fake_main()
{
	int32_t* p = NULL;
	int32_t pptr = 1;
	p = &pptr;

	while (p)   /* Non-compliant - p is a pointer */
	{
	}

	int32_t i = 10;
	if (i)    /* Non-compliant */
	{

	}

	return 0;
}
