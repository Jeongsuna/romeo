#include another.h        /* Non-compliant */
#include FILENAME         /* Non-compliant */
#include BASE EXT         /* Non-compliant - string are concatenated after preprocessing */

#define FILENAME file2.h

#define BASE "base"
#define EXT ".ext"

int fake_main()
{
	return 0;
}