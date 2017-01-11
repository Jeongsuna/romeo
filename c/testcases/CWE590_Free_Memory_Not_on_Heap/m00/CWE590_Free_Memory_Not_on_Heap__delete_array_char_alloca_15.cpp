/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE590_Free_Memory_Not_on_Heap__delete_array_char_alloca_15.cpp
Label Definition File: CWE590_Free_Memory_Not_on_Heap__delete_array.label.xml
Template File: sources-sink-15.tmpl.cpp
*/
/*
 * @description
 * CWE: 590 Free Memory Not on Heap
 * BadSource: alloca Data buffer is allocated on the stack with alloca()
 * GoodSource: Allocate memory on the heap
 * Sink:
 *    BadSink : Print then free data
 * Flow Variant: 15 Control flow: switch(6)
 *
 * */

#include "std_testcase.h"

#include <wchar.h>

namespace CWE590_Free_Memory_Not_on_Heap__delete_array_char_alloca_15
{

#ifndef OMITBAD

void bad()
{
    char * data;
    data = NULL; /* Initialize data */
    switch(6)
    {
    case 6:
    {
        /* FLAW: data is allocated on the stack and deallocated in the BadSink */
        char * dataBuffer = (char *)ALLOCA(100*sizeof(char));
        memset(dataBuffer, 'A', 100-1); /* fill with 'A's */
        dataBuffer[100-1] = '\0'; /* null terminate */
        data = dataBuffer;
    }
    break;
    default:
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        printLine("Benign, fixed string");
        break;
    }
    printLine(data);
    /* POTENTIAL FLAW: Possibly deallocating memory allocated on the stack */
    delete [] data;
}

#endif /* OMITBAD */

#ifndef OMITGOOD

/* goodG2B1() - use goodsource and badsink by changing the switch to switch(5) */
static void goodG2B1()
{
    char * data;
    data = NULL; /* Initialize data */
    switch(5)
    {
    case 6:
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        printLine("Benign, fixed string");
        break;
    default:
    {
        /* FIX: data is allocated on the heap and deallocated in the BadSink */
        char * dataBuffer = new char[100];
        memset(dataBuffer, 'A', 100-1); /* fill with 'A's */
        dataBuffer[100-1] = '\0'; /* null terminate */
        data = dataBuffer;
    }
    break;
    }
    printLine(data);
    /* POTENTIAL FLAW: Possibly deallocating memory allocated on the stack */
    delete [] data;
}

/* goodG2B2() - use goodsource and badsink by reversing the blocks in the switch */
static void goodG2B2()
{
    char * data;
    data = NULL; /* Initialize data */
    switch(6)
    {
    case 6:
    {
        /* FIX: data is allocated on the heap and deallocated in the BadSink */
        char * dataBuffer = new char[100];
        memset(dataBuffer, 'A', 100-1); /* fill with 'A's */
        dataBuffer[100-1] = '\0'; /* null terminate */
        data = dataBuffer;
    }
    break;
    default:
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        printLine("Benign, fixed string");
        break;
    }
    printLine(data);
    /* POTENTIAL FLAW: Possibly deallocating memory allocated on the stack */
    delete [] data;
}

void good()
{
    goodG2B1();
    goodG2B2();
}

#endif /* OMITGOOD */

} /* close namespace */

/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

using namespace CWE590_Free_Memory_Not_on_Heap__delete_array_char_alloca_15; /* so that we can use good and bad easily */

int main(int argc, char * argv[])
{
    /* seed randomness */
    srand( (unsigned)time(NULL) );
#ifndef OMITGOOD
    printLine("Calling good()...");
    good();
    printLine("Finished good()");
#endif /* OMITGOOD */
#ifndef OMITBAD
    printLine("Calling bad()...");
    bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
