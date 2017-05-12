/*
Filename : C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_good.c
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
    char data_buf[100] = "";
    data = data_buf;
    /* FIX: Benign input preventing command injection */
    strcat(data, "trustedvalue");

    {
        char * data = "trustedvalue";

        char   **array, **arrayStep;
        char   cname[1024], cvalue[1024];
        fprintf(cgiOut, "Cookies Submitted On This Call, With Values "
                "(Many Browsers NEVER Submit Cookies):<p>\n");
        if (cgiCookies(&array) != cgiFormSuccess) {
            return;
        }
        arrayStep = array;
        fprintf(cgiOut, "<table border=1>\n");
        fprintf(cgiOut, "<tr><th>Cookie<th>Value</tr>\n");
        while (*arrayStep) {
            char value[1024];
            fprintf(cgiOut, "<tr>");
            fprintf(cgiOut, "<td>");
            cgiHtmlEscape(*arrayStep);
            fprintf(cgiOut, "<td>");
            cgiCookieString(*arrayStep, value, sizeof(value));
            cgiHtmlEscape(value);
            fprintf(cgiOut, "\n");
            arrayStep++;
        }
        fprintf(cgiOut, "</table>\n");
        cgiFormString("cname", cname, sizeof(cname));  
        cgiFormString("cvalue", cvalue, sizeof(cvalue));
        
        /* FLAW */
        if (strlen(cname) && !strncmp(cvalue, data, sizeof(data)))
        {
            fprintf(cgiOut, "New Cookie Set On This Call:<p>\n");
            fprintf(cgiOut, "Name: ");  
            cgiHtmlEscape(cname);
            fprintf(cgiOut, "Value: ");  
            cgiHtmlEscape(cvalue);
            fprintf(cgiOut, "<p>\n");
            fprintf(cgiOut, "If your browser accepts cookies "
                    "(many do not), this new cookie should appear "
                    "in the above list the next time the form is "
                    "submitted.<p>\n"); 
        }
        else
        {
            fprintf(cgiOut, "Untrusted values<p>\n");        
        }
    
        cgiStringArrayFree(array);
    }

}

void C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_good()
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
    C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
