/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE122_Heap_Based_Buffer_Overflow__placement_new_51a.cpp
Label Definition File: CWE122_Heap_Based_Buffer_Overflow__placement_new.label.xml
Template File: sources-sinks-51a.tmpl.cpp
*/
/*
 * @description
 * CWE: 122 Heap Based Buffer Overflow
 * BadSource:  Initialize data to a small buffer
 * GoodSource: Initialize data to a buffer large enough to hold a TwoIntsClass
 * Sinks:
 *    GoodSink: Allocate a new class using placement new and a buffer that is large enough to hold the class
 *    BadSink : Allocate a new class using placement new and a buffer that is too small
 * Flow Variant: 51 Data flow: data passed as an argument from one function to another in different source files
 *
 * */

#include "std_testcase.h"

namespace CWE122_Heap_Based_Buffer_Overflow__placement_new_51
{

#ifndef OMITBAD

/* bad function declaration */
void badSink(char * data);

void bad()
{
    char * data;
    char * dataBadBuffer = (char *)malloc(sizeof(OneIntClass));
    char * dataGoodBuffer = (char *)malloc(sizeof(TwoIntsClass));
    /* POTENTIAL FLAW: Initialize data to a buffer small than the sizeof(TwoIntsClass) */
    data = dataBadBuffer;
    badSink(data);
}

#endif /* OMITBAD */

#ifndef OMITGOOD

/* good function declarations */
void goodG2BSink(char * data);
void goodB2GSink(char * data);

/* goodG2B uses the GoodSource with the BadSink */
static void goodG2B()
{
    char * data;
    char * dataBadBuffer = (char *)malloc(sizeof(OneIntClass));
    char * dataGoodBuffer = (char *)malloc(sizeof(TwoIntsClass));
    /* FIX: Initialize to a buffer at least the sizeof(TwoIntsClass) */
    data = dataGoodBuffer;
    goodG2BSink(data);
}

/* goodB2G uses the BadSource with the GoodSink */
static void goodB2G()
{
    char * data;
    char * dataBadBuffer = (char *)malloc(sizeof(OneIntClass));
    char * dataGoodBuffer = (char *)malloc(sizeof(TwoIntsClass));
    /* POTENTIAL FLAW: Initialize data to a buffer small than the sizeof(TwoIntsClass) */
    data = dataBadBuffer;
    goodB2GSink(data);
}

void good()
{
    goodG2B();
    goodB2G();
}

#endif /* OMITGOOD */

} /* close namespace */

/* Below is the main(). It is only used when building this testcase on
   its own for testing or for building a binary to use in testing binary
   analysis tools. It is not used when compiling all the testcases as one
   application, which is how source code analysis tools are tested. */

#ifdef INCLUDEMAIN

using namespace CWE122_Heap_Based_Buffer_Overflow__placement_new_51; /* so that we can use good and bad easily */

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
