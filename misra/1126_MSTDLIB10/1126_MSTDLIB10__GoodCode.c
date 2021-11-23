#include <stdio.h>
#include <wchar.h>

/* Compliant */
int main(void)
{
	wchar_t   dest[100];
	size_t    rc;

	rc = scanf_s(L"%s", dest);
	printf("%d characters placed in string to make:%ls\n", rc, dest);
	return 0;
}