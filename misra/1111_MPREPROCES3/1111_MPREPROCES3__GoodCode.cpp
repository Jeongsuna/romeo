#include "filename.h"     /* Compliant */
// #include <filename.h>     /* Compliant */

#define HEADER "filename.h"
#define HEADER            /* Compliant */

#include "./include/cpu.h"/* Compliant - filename may include a path */

int main()
{
	return 0;
}