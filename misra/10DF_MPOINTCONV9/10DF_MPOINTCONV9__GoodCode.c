#include <stddef.h>     /* To obtain macro NULL */

#define MY_NULL_2 ( void * ) 0

typedef signed int int32_t;
typedef unsigned char uint8_t;

void f(uint8_t* p) {};

/* Compliant for any conforming definition of NULL, such as:
 *    0
 *    ( void * ) 0
 *    ( ( ( 0 ) ) )
 *    ( ( ( 1 -1 ) ) )
 */


int main()
{
	int32_t* p2 = (void*)0; /* Compliant */


	if (p2 == MY_NULL_2)  /* Compliant */
	{
	}

	/* Could also use stdio.h, stdlib.h and others in hosted environments */

	f(NULL);
}
