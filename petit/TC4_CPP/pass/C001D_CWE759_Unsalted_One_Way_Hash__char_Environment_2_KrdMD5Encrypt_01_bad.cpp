/*
Filename : C001D_CWE759_Unsalted_One_Way_Hash__char_Environment_2_KrdMD5Encrypt_01_bad.cpp
*/

#include "std_testcase.h"




#define ENV_VARIABLE "ADD"

#ifdef _WIN32
# define GETENV getenv
#else
# define GETENV getenv
#endif




#include <rcryptutil.h>

#pragma comment(lib, "advapi32.lib")
#pragma comment(lib, "user32.lib")


#ifndef OMITBAD

void C001D_CWE759_Unsalted_One_Way_Hash__char_Environment_2_KrdMD5Encrypt_01_bad()
{
    char * data;
    char data_buf[100] = "";
    data = data_buf;
    {
        /* Read input from an environment variable */
        size_t data_len = strlen(data);
        char * environment = GETENV(ENV_VARIABLE);
        /* If there is data in the environment variable */
        if (environment != NULL)
        {
            strncat(data+data_len, environment, 100-data_len-1);
        }
    }

    {
        char * p_enc = NULL;
        /* FLAW */
        p_enc = RMD5Encrypt(data, NULL);
        printLine(p_enc);
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
    C001D_CWE759_Unsalted_One_Way_Hash__char_Environment_2_KrdMD5Encrypt_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
