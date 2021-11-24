#include <stdio.h>

void fn(void)
{
	char buffer[20];

	FILE* fp = fopen("tmp", "r");

	fgets(buffer, sizeof(buffer), fp);      /* Compliant */

	printf("%s\n", buffer);

	(void)fclose(fp);
}

int main()
{
	fn();
	return 0;
}