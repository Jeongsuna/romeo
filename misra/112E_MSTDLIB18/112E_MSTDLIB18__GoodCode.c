#include <memory.h>
#include <string.h>

char buf1[5] = "12345";
char buf2[10] = "1234567890";

void f(void)
{
	if (memcmp(buf1, buf2, 5) == 0)      /* Compliant */
	{
	}
}

int main()
{
	return 0;
}