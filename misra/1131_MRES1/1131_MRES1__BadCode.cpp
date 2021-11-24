#include <stdlib.h>

int main4(void)
{
	void* b = malloc(40);

	/* Non-compliant - dynamic memory not released */
	return 1;
}

#include <stdio.h>

int main5(void)
{
	FILE* fp = fopen("tmp", "r");

	/*Non-compliant - file not closed */
	return 1;
}

#include <stdio.h>

int main6(void)
{
	FILE* fp;
	fp = fopen("tmp-1", "w");
	fprintf(fp, "*");
	/* File "tmp-1" should be closed here, but stream 'leaks'. */
	fp = fopen("tmp-2", "w");
	fprintf(fp, "!");
	fclose(fp);
	return (0);
}