#include <stdlib.h>
void f(void)
{
    char* p = (char*)malloc(10);
    char* q;
    free(p);
    q = p; /* Undefined behaviour - value of p is indeterminate */

    p = (char*)malloc(20);
    free(p);
    p = NULL; /* Assigning NULL to freed pointer makes it determinate */
}