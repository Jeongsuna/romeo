/*
Filename : C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_bad.c
*/

#include "std_testcase.h"

#ifndef OMITBAD

void C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_bad()
{
    {
        /* By initializing data_buf, we ensure this will not be the
         * CWE 690 (Unchecked Return Value To NULL Pointer) flaw for fgets() and other variants */
        char data_buf[100] = "";
        char * data = data_buf;
        /* FLAW: Do not check the return value */
        fscanf(stdin, "%99s\0", data);
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
    C0024_CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__char_fscanf_char_fscanf_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
