/*
Filename : C0013_CWE327_Use_Broken_Crypto__basic_EVP_EncryptInit_01_bad.c
*/

#include <stdio.h>
#include <string.h>
#include <memory.h>
#include "std_testcase.h"
#include   "krdopenssl.h"

#ifndef OMITBAD

void C0013_CWE327_Use_Broken_Crypto__basic_EVP_EncryptInit_01_bad() {
	EVP_CIPHER_CTX ctx;
	EVP_CIPHER_CTX_init(&ctx);
	/* FLAW */
	EVP_EncryptInit(&ctx, EVP_des_ecb(), NULL, NULL);
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
    C0013_CWE327_Use_Broken_Crypto__basic_EVP_EncryptInit_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
