/*
Filename : C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_bad.c
*/

#include "std_testcase.h"

#include <wchar.h>
#include <windows.h>
#include <wincrypt.h>
#pragma comment(lib, "advapi32")
#pragma comment(lib, "crypt32.lib")

#define PASSWORD "KISAABCD"
#define HASH_INPUT "ABCDEFG123456" /* INCIDENTAL: Hardcoded crypto */

#ifndef OMITBAD

void C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_bad()
{
    char * data;
    char data_buf[100] = "";
    data = data_buf;
    {
		FILE *pw_file, *data_file;

		/* Read input from the console */
		size_t data_len = strlen(data);
        /* if there is room in data, read into it from the console */
        /* POTENTIAL FLAW: Read data from the console */
        if(100-data_len > 1)
        {
			printf("Enter your password: ");
            if (fgets(data+data_len, (int)(100-data_len), stdin) != NULL)
            {
                /* The next 3 lines remove the carriage return from the string that is
                 * inserted by fgets() */
                data_len = strlen(data);
                if (data_len > 0 && data[data_len-1] == '\n')
                {
                    data[data_len-1] = '\0';
                }
            }
            else
            {
                printLine("fgets() failed");
                /* Restore NUL terminator if fgets fails */
                data[data_len] = '\0';
            }
        }

		pw_file = fopen("passwords.txt", "w");
		/* FLAW */
		fprintf(pw_file, "%s",data);
		fclose(pw_file);
        
        data_file = fopen("passwords.txt", "r");
        if (data_file != NULL)
        {
            /* POTENTIAL FLAW: Read the password from a file */
            if (fgets(data, 100, data_file) == NULL)
            {
                data[0] = '\0';
            }
            fclose(data_file);
        }
        else
        {
            data[0] = '\0';
        }
    }
    {
		if(strcmp(PASSWORD, data) == 0)
		{
			printLine("You have successfully logged in");
		}
		else
		{
			printLine("You have entered wrong password");
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
    C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
