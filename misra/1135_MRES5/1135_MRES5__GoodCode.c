#include <stdio.h>

int main() {
	FILE* pf1;
	FILE* pf2;
	FILE f3;

	pf2 = &f3;    /* Compliant */
	pf1 = pf2;    /* Compliant */

	printf("%p\n", pf1);
	printf("%p\n", pf2);

	return 0;
}