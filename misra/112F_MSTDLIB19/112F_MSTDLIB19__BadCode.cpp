#include <stdio.h>
#include <string.h>
#include <stddef.h>
#include <locale.h>

void f1(void)
{
	char* s1 = setlocale(LC_ALL, 0);    /* Non-compliant */
	struct lconv* conv = localeconv();          /* Non-compliant */

	s1[1] = 'A';            /* Undefined behaviour */
	conv->decimal_point[2] = "^";   /* Undefined behaviour */
}

void f3(void)
{
	const struct lconv* conv = localeconv();   /* Compliant */

	conv->grouping[2] = 'x';               /* Non- compliant */
}

int fake_main()
{
	return 0;
}