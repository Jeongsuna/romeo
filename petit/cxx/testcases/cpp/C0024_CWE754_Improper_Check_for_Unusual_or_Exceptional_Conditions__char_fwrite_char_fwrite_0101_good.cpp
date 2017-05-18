/*
Filename : C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_good.cpp
*/

#include "std_testcase.h"


#ifndef OMITGOOD

static void good1()
{
    {
        /* FIX: check the return value */
        if (fwrite((char *)"string", sizeof(char), strlen("string"), stdout) != strlen("string"))
        {
            printLine("fwrite failed!");
        }
    }
}

void C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_good()
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
    C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fwrite_char_fwrite_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
