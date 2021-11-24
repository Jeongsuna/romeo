#include <stdlib.h>

int main(void)
{
	void* b = malloc(40);

	free(b);                 /* Compliant */
	return 1;
}

#include <stdio.h>

int main2(void)
{
	FILE* fp = fopen("tmp", "r");

	fclose(fp);              /* Compliant */
	return 1;
}

#include <stdio.h>

int main3(void)
{
	FILE* fp;
	fp = fopen("tmp-1", "w");
	fprintf(fp, "*");
	fclose(fp);              /* Compliant */
	fp = fopen("tmp-2", "w");
	fprintf(fp, "!");
	fclose(fp);
	return (0);
}