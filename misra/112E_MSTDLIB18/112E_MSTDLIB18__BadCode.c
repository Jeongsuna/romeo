#include <memory.h>
#include <string.h>

char buf1_2[5] = "12345";
char buf2_2[10] = "1234567890";

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