/*
Filename : C0002_CWE23_Relative_Path_Traversal__char_fromFile_fopen_01_good.c
*/

#include "std_testcase.h"

#ifdef _WIN32
#define BASEPATH "c:\\"
#else
#define BASEPATH "/tmp/"
#endif

#ifdef _WIN32
# define FOPEN fopen
#else
/* fopen is used on unix-based OSs */
# define FOPEN fopen
#endif

#ifdef _WIN32
# define FOPEN fopen
#else
/* fopen is used on unix-based OSs */
# define FOPEN fopen
#endif


#ifndef OMITGOOD

/* goodG2B uses the GoodSource with the BadSink */
static void good1()
{
    char * data;
    char data_buf[FILENAME_MAX] = BASEPATH;
    data = data_buf;
    /* FIX: File name does not contain a period or slash */
    strcat(data, "file.txt");
    {
        FILE *file = NULL;
        /* POTENTIAL FLAW: Possibly opening a file without validating the file name or path */
        file = FOPEN(data, "wb+");
        if (file != NULL) fclose(file);
    }
}

void C0002_CWE23_Relative_Path_Traversal__char_fromFile_fopen_01_good()
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
    C0002_CWE23_Relative_Path_Traversal__char_fromFile_fopen_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
