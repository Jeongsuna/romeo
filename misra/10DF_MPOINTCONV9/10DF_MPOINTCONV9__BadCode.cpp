#include <cstdint>
#define MY_NULL_1 0

int fake_main()
{
	int32_t* p1 = 0;    /* Non-compliant */

	if (p1 == MY_NULL_1)  /* Non-compliant */
	{
	}
	
	return 0;
}