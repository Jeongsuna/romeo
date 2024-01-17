#include <stdio.h>

int main()
{
	FILE* pf1 = 0;
	FILE* pf2;
	FILE f3;

	pf2 = pf1;    /* Compliant */
	f3 = *pf2;    /* Non-compliant */

	pf1->_Placeholder = 0; /* Non-compliant */

	return 0;
}