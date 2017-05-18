/*
Filename : C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_bad.c
*/

#include "std_testcase.h"
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#ifndef OMITBAD

#define ID "user"
#define PWD "pass1234"

void C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_bad()
{
	char getID[100];
    char password[100];
    {
		int ok = 0;

		/* FLAW: Uncontrolled Login form */
		do{
			printLine("Please input your ID.");
			fgets(getID, 100, stdin);
				
			printLine("Please input your password.");
			fgets(password, 100, stdin);

			getID[strlen(getID)-1] = '\0';
			password[strlen(password)-1] = '\0';
			
			if((strcmp(ID, getID) == 0) && (strcmp(PWD, password) == 0))
			{
				ok = 1;
				printLine("[Login success]\n");
			}else{
				printLine("[Login fail]\n");
			}
		}while(!ok);
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
    C001F_CWE307_Improper_Restriction_of_Excessive_Authentication_Attempts__fromConsole_strcmp_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
