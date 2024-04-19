#include <memory.h>
#include <string.h>

char buf1_2[5] = "1234";
char buf2_2[10] = "123456789";

void f2(void)
{
	if (memcmp(buf1_2, buf2_2, 6) == 0)      /* Non-compliant */
	{
	}
}

int fake_main()
{
	return 0;
}