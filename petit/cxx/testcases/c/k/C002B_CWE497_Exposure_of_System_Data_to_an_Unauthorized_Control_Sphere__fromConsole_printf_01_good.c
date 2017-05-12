/*
Filename : C002B_CWE497_Exposure_of_System_Data_to_an_Unauthorized_Control_Sphere__fromConsole_printf_01_good.c
*/

#include "std_testcase.h"

#include <stdio.h>
#include <direct.h>


#ifndef OMITGOOD

static void good1()
{
	FILE * fp;
	char in[100];
	char * data;
    char data_buf[100] = "";
    data = data_buf;
    {
        /* Read input from the console */
        size_t data_len = strlen(data);
        /* if there is room in data, read into it from the console */
        if(100-data_len > 1)
        {
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
    }

	fp = fopen(data,"r");
	if(fp == NULL)
	{
		/* FIX */
		printf("Cannot find the file: %s",data);
	}
	else
	{
		while(fgets(in, 100, fp) != NULL)
		{
			printf(in);
		}
	}

	fcloseall();
}

void C002B_CWE497_Exposure_of_System_Data_to_an_Unauthorized_Control_Sphere__fromConsole_printf_01_good()
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
    C002B_CWE497_Exposure_of_System_Data_to_an_Unauthorized_Control_Sphere__fromConsole_printf_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
