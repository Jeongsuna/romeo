/*
Filename : C0001_CWE89_SQL_Injection__char_connect_socket_mysql_query_01_good.c
CWEID    : CWE89
sinkname : mysql_query
sinkline : 62,
makedate : 2012 12 24
license  : Copyright KISA.
*/

#include "std_testcase.h"

#include <my_global.h>
#include <mysql.h>


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
    strcat(data, "John");

    {
        char q[512] = {0,};
        MYSQL *conn;

        sprintf(q, "insert into users (ID,name) values ('5','%s')", data);

        conn = mysql_init(NULL);
        mysql_real_connect(conn, "192.168.0.100", "root", "apmsetup", "test", 0, NULL, 0);
        /* FLAW */
        mysql_query(conn, q);
        mysql_close(conn);
    }

}

void C0001_CWE89_SQL_Injection__char_connect_socket_mysql_query_01_good()
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
    C0001_CWE89_SQL_Injection__char_connect_socket_mysql_query_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
