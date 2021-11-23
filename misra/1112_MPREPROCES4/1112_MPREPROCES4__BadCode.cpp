// #define int some_other_type
#include <stdlib.h>

// #define while( E ) for ( ; ( E ) ; )      /* Non-compliant - redefined while */

/* Remove inline if compiling for C90
 * Compliant in C90, but not C99 - inline is not a keyword in C90 */
// #define inline

int fake_main()
{
	return 0;
}