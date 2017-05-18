/*
Filename : C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_good.c
*/

#include "std_testcase.h"
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#ifndef OMITGOOD

#define ID "user"
#define PWD "pass1234"

static void good1()
{
	int invalidateTimes = 0;
	char getID[100];
    char password[100];
    {
		int ok = 0;

		do{
			if(invalidateTimes >= 3)
			{
				printLine("1 Minutes Locked\n");
				Sleep(60*1000);
				invalidateTimes = 0;
			}
			printLine("Please input your ID.");
			fgets(getID, 100, stdin);
				
			printLine("Please input your password.");
			fgets(password, 100, stdin);

			getID[strlen(getID)-1] = '\0';
			password[strlen(password)-1] = '\0';
			
			/* FIX */
			if((strcmp(ID, getID) == 0) && (strcmp(PWD, password) == 0))
			{
				ok = 1;
				printLine("[Login success]\n");
			}else{
				printLine("[Login fail]\n");
				invalidateTimes++;
			}
		}while(!ok);
    }
}

void C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_good()
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
    C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
