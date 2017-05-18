/*
Filename : C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_good.c
*/

#include "std_testcase.h"
#define DEBUG_ENABLE
#ifdef DEBUG_ENABLE
    #define DEBUG(message) { puts(message); }
#else
    #define DEBUG(message)
#endif


#ifndef OMITGOOD

static void good1()
{
    /* FIX */
	DEBUG("Debug message");
}

void C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_good()
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
    C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif

