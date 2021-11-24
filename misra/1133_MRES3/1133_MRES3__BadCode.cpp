#include <stdio.h>

void fn2(void)
{
	FILE* fw = fopen("tmp", "r+");   /* "r+" opens for read/write */
	FILE* fr = fopen("tmp", "r");    /* Non-compliant */
}

int fake_main()
{
	fn2();
	return 0;
}