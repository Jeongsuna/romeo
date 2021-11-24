#include <stdio.h>

void fn2(void)
{
	FILE* fp = fopen("tmp", "r");

	(void)fprintf(fp, "What happens now?");   /* Non-compliant */

	(void)fclose(fp);
}

int fake_main()
{
	fn2();
	return 0;
}