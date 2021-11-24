/* file.c */
#ifdef A        /* Compliant */
#include "file1.h"
#endif
/* End of file1.c */

/* file1.h */
#if 1         /* Compliant */
#endif
/* End of file1.h */

int main()
{
	return 0;
}