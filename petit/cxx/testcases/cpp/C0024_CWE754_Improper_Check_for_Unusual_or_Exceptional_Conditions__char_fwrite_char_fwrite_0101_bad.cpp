/*
Filename : C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_bad.cpp
*/

#include "std_testcase.h"

#ifndef OMITBAD

void C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_bad()
{
    {
        /* FLAW: Do not check the return value */
        fwrite((char *)"string", sizeof(char), strlen("string"), stdout);
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
    C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
