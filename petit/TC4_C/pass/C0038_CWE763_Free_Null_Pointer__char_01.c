#include "std_testcase.h"


void bad(int n)
{
    char * data;
    /* POTENTIAL FLAW: Set data to NULL */
    data = NULL;

    if(n > 0) {
       data = (char*)malloc(32*sizeof(char));
    }
    /* POTENTIAL FLAW: Attempt to free data, which may be NULL */
    free(data);
}

