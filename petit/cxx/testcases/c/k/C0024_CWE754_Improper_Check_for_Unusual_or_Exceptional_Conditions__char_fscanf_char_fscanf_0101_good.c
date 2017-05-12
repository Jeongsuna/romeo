/*
Filename : C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_good.c
*/

#include "std_testcase.h"


#ifndef OMITGOOD

static void good1()
{
    {
        /* By initializing data_buf, we ensure this will not be the
         * CWE 690 (Unchecked Return Value To NULL Pointer) flaw for fgets() and other variants */
        char data_buf[100] = "";
        char * data = data_buf;
        /* FIX: check the return value */
        if (fscanf(stdin, "%99s\0", data) == EOF)
        {
            printLine("fscanf failed!");
        }
    }
}

void C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_good()
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
    C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
