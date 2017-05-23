/*
Filename : C001C_CWE615_Info_Leak_By_Comment__char_Environment_2_comment_01_bad.cpp
*/

#include "std_testcase.h"




#define ENV_VARIABLE "ADD"

#ifdef _WIN32
# define GETENV getenv
#else
# define GETENV getenv
#endif




#include <windows.h>
#include <stdio.h>
#include <string.h>


#ifndef OMITBAD

void C001C_CWE615_Info_Leak_By_Comment__char_Environment_2_comment_01_bad()
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
        char * sz_id = "hello";
        char * sz_pa = "fixedstringtest";

        /* FLAW */
        /* DB username = hello, DB password = fixedstringtest */
        if (strncmp (sz_pa, data, strlen(data)) != 0)
        {
            printf("Invalid Password Error");
        }
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
    C001C_CWE615_Info_Leak_By_Comment__char_Environment_2_comment_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
