/*
Filename : C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_good.c
*/

#include "std_testcase.h"

#include <wchar.h>
#include <windows.h>
#include <wincrypt.h>
#include <stdio.h>
#include "sha256.h"
#pragma comment(lib, "advapi32")
#pragma comment(lib, "crypt32.lib")

#define PASSWORD_HASH "0eee94def86d480eb23b122a4c5445c81e5773c57858fca40652367006f60f3b"
#define HASH_INPUT "ABCDEFG123456" /* INCIDENTAL: Hardcoded crypto */


#ifndef OMITGOOD

/* goodG2B uses the GoodSource with the BadSink */

/* goodB2G uses the BadSource with the GoodSink */
static void goodB2G()
{
	int i,j;
	FILE *pw_file, *data_file, *f;
    char * data;
    char data_buf[100] = "";
	unsigned char buf[200];
	unsigned char sha256sum[32];
	char * result = "";
	sha256_context ctx;
    data = data_buf;
	
    {
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

		sha256_starts(&ctx);

		sha256_update(&ctx,(unsigned char*)data,strlen(data));
		/* FIX */
		sha256_finish(&ctx, sha256sum);


		result = (char *)malloc(65*sizeof(char));

		for(j = 0; j < 32; j++)
		{
			_snprintf(result+(2*j),64,"%02x",sha256sum[j]);
		}
    }

    pw_file = fopen("passwords.txt", "w");
	fprintf(pw_file, "%s",result);
	fclose(pw_file);

	free(result);
}

void C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_good()
{

    goodB2G();
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
    C0014_CWE312_Cleartext_Storage_of_Sensitive_Information__w32_char_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
