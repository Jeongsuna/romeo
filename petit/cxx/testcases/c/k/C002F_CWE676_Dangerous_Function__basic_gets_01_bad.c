/*
Filename : C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_bad.c
*/

#include "std_testcase.h"

#define DST_SZ 10

#ifndef OMITBAD

void C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_bad()
{
    {
        char dst[DST_SZ];
        char *result;
        /* FLAW: gets is inherently dangerous and cannot be used safely. */
        /* INCIDENTAL CWE120 Buffer Overflow since gets is inherently dangerous and is
         * an unbounded copy. */
        result = gets(dst);
        /* Verify return value */
        if( NULL == result )
        {
            /* error condition */
            printLine("Error Condition: alter control flow to indicate action taken");
            exit(1);
        }
        dst[DST_SZ-1] = '\0';
        printLine(dst);
    }
}

#endif /* OMITBAD */


/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

int main(int argc, char * argv[])
{
    /* seed randomness */
    srand( (unsigned)time(NULL) );
#ifndef OMITBAD
    printLine("Calling bad()...");
    C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
