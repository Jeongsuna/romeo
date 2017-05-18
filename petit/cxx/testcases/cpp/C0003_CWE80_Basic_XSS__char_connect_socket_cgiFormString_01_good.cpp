/*
Filename : C0003_CWE80_Basic_XSS__char_connect_socket_cgiFormString_01_good.cpp
*/

#include "std_testcase.h"

#include "cgic.h"


#include <wchar.h>



#ifdef _WIN32
# include <winsock2.h>
# include <windows.h>
# include <direct.h>
# pragma comment(lib, "ws2_32") /* include ws2_32.lib when linking */
# define CLOSE_SOCKET closesocket
# define PATH_SZ 100
#else /* NOT _WIN32 */
# define INVALID_SOCKET -1
# define SOCKET_ERROR -1
# define CLOSE_SOCKET close
# define SOCKET int
# define PATH_SZ PATH_MAX
#endif

#define TCP_PORT 27015






#ifndef OMITGOOD

/* goodG2B uses the GoodSource with the BadSink */
static void good1()
{
    char * data;
    char data_buf[100] = "John";
    data = data_buf;
    /* FIX: Benign input preventing command injection */
    strcat(data, "John");

    {
        char cname[1024];
        char cvalue[1024];
        /* Must set cookies BEFORE calling 
        cgiHeaderContentType */
        /* FLAW */
        cgiFormString("cname", cname, sizeof(cname));  
        /* FLAW */
        cgiFormString(data, cvalue, sizeof(cvalue));  
        if (strlen(cname)) {
            /* Cookie lives for one day (or until 
            browser chooses to get rid of it, which 
            may be immediately), and applies only to 
            this script on this site. */  
            cgiHeaderCookieSetString(cname, cvalue,
                86400, cgiScriptName, cgiServerName);
  }
    }

}

void C0003_CWE80_Basic_XSS__char_connect_socket_cgiFormString_01_good()
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
    C0003_CWE80_Basic_XSS__char_connect_socket_cgiFormString_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
