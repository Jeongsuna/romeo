/*
Filename : C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_good.c
*/

#include "std_testcase.h"

#define DST_SZ 10

#ifndef OMITGOOD

static void good1()
{
    {
        char dst[DST_SZ];
        char *result;
        /* FIX: use fgets for bounded read from stdin*/
        result = fgets(dst, DST_SZ, stdin);
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

void C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_good()
{
    good1();
}

#endif /* OMITGOOD */

/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

int main(int argc, char * argv[])
{
    /* seed randomness */
    srand( (unsigned)time(NULL) );
#ifndef OMITGOOD
    printLine("Calling good()...");
    C002F_CWE676_Use_of_Potentially_Dangerous_Function__basic_gets_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
