/*
Filename : C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_bad.c
*/

#include "std_testcase.h"

#ifndef OMITBAD

void C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_bad()
{
	/* FLAW */
	printLine("Debug Info...");
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
    C002A_CWE489_Leftover_Debug_Code__basic_printLine_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif