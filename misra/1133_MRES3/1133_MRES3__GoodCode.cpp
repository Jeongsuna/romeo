#include <stdio.h>

void fn(void)
{
	/* Compliant - Only one stream for tmp */
	FILE* fw = fopen("tmp", "r+");   /* "r+" opens for read/write */
}

int main()
{
	fn();
	return 0;
}