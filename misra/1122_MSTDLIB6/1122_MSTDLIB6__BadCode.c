#include <stdio.h>             /* Not Compliant to include stdio.h */

void mc2_2009(void)
{
	(void)printf("The library stdio shall not be used\n"); /* Not Compliant */
}

int main() {
	mc2_2009();
	return 0;
}