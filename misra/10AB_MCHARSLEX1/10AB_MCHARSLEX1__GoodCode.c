// #include <stdio.h> 추가
// main() 추가
#include <stdio.h>

const char *s2 = "\x41" "g"; /* Compliant - terminated by end of literal */
const char* s3 = "\x41\x67"; /* Compliant - terminated by another escape */
int c2 = '\141\t'; /* Compliant - terminated by another escape */

int fake_main()
{
	return 0;
}
