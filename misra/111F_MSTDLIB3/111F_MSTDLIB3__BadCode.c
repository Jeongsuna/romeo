#include <stdlib.h>

void mc2_2004(void)
{
	char* mc2_2004_p;

	mc2_2004_p = (char*)malloc(11U);  /* Not Compliant: use of malloc  */
	(void)realloc(mc2_2004_p, 20U);        /* Not Compliant: use of realloc */
	free(mc2_2004_p);                      /* Not Compliant: use of free    */
}

int main() {
	mc2_2004();
	return 0;
}