/*
Filename : C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_bad.c
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





#ifndef OMITBAD

void C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_bad()
{
    char * data;
    char data_buf[100] = "";
    data = data_buf;
    {
#ifdef _WIN32
        WSADATA wsa_data;
        int wsa_data_init = 0;
#endif
        int recv_rv;
        struct sockaddr_in s_in;
        char *replace;
        SOCKET connect_socket = INVALID_SOCKET;
        size_t data_len = strlen(data);
        do
        {
#ifdef _WIN32
            if (WSAStartup(MAKEWORD(2,2), &wsa_data) != NO_ERROR) break;
            wsa_data_init = 1;
#endif
            connect_socket = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP);
            if (connect_socket == INVALID_SOCKET) break;
            memset(&s_in, 0, sizeof(s_in));
            s_in.sin_family = AF_INET;
            s_in.sin_addr.s_addr = inet_addr("127.0.0.1");
            s_in.sin_port = htons(TCP_PORT);
            if (connect(connect_socket, (struct sockaddr*)&s_in, sizeof(s_in)) == SOCKET_ERROR) break;
            /* Abort on error or the connection was closed, make sure to recv one
             * less char than is in the recv_buf in order to append a terminator */
            recv_rv = recv(connect_socket, (char *)data+data_len, (int)(100-data_len-1), 0);
            if (recv_rv == SOCKET_ERROR || recv_rv == 0) break;
            /* Append null terminator */
            data[data_len + recv_rv / sizeof(char)] = '\0';
            /* Eliminate CRLF */
            replace = strchr(data, '\r');
            if (replace) *replace = '\0';
            replace = strchr(data, '\n');
            if (replace) *replace = '\0';
        }
        while (0);
        if (connect_socket != INVALID_SOCKET) CLOSE_SOCKET(connect_socket);
#ifdef _WIN32
        if (wsa_data_init) WSACleanup();
#endif
    }

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
    C000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__char_connect_socket_cookie_strncmp_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
