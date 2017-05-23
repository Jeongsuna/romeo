#include "std_testcase.h"

#ifndef OMITBAD

int bad()
{
    int data;
    /* POTENTIAL FLAW: Set data to zero */
    data = -1;
    /* POTENTIAL FLAW: Possibly divide by zero */
    printIntLine(32 << data);
}

#endif /* OMITBAD */

