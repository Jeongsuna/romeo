/*
Filename : C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_bad.cpp
*/

#include "std_testcase.h"



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


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <oci.h>



#ifndef OMITBAD

void C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_bad()
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
            s_in.sin_addr.s_addr = inet_addr("192.168.0.100");
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
        text errbuf[512];
        text *username = (text *) "user";
		text *password = (text *) "pass12#";

        OCIEnv *envhp;
        OCIError *errhp;
        sword status;
    
        sb4         enamelen = 10;
        text       *ename;
        OCISession *authp    = (OCISession *) 0;
        OCIServer  *srvhp;
        OCISvcCtx  *svchp;
        OCIStmt    *inserthp, *stmthp;
        OCIBind    *bnd1p    = (OCIBind *) 0; /* the first bind handle */
        sword       errcode  = 0;

        char q[512]          = {0,};        

        sprintf(q, "insert into users (status) values ('updated') where name=%s", data);
        
        errcode = OCIEnvCreate((OCIEnv **) &envhp, (ub4) OCI_DEFAULT,
                           (dvoid *) 0, (dvoid * (*)(dvoid *,size_t)) 0,
                           (dvoid * (*)(dvoid *, dvoid *, size_t)) 0,
                           (void (*)(dvoid *, dvoid *)) 0, (size_t) 0, (dvoid **) 0);
    
        if (errcode != 0) {
            (void) printf("OCIEnvCreate failed with errcode = %d.\n", errcode);
            exit(1);
        }
        
        (void) OCIHandleAlloc( (dvoid *) envhp, (dvoid **) &errhp, OCI_HTYPE_ERROR,
                               (size_t) 0, (dvoid **) 0);
        
        /* server contexts */
        (void) OCIHandleAlloc( (dvoid *) envhp, (dvoid **) &srvhp, OCI_HTYPE_SERVER,
                               (size_t) 0, (dvoid **) 0);
  
        (void) OCIHandleAlloc( (dvoid *) envhp, (dvoid **) &svchp, OCI_HTYPE_SVCCTX,
                               (size_t) 0, (dvoid **) 0);
        
        (void) OCIServerAttach( srvhp, errhp, (text *)"", strlen(""), 0);

        /* set attribute server context in the service context */
        (void) OCIAttrSet( (dvoid *) svchp, OCI_HTYPE_SVCCTX, (dvoid *)srvhp,
                           (ub4) 0, OCI_ATTR_SERVER, (OCIError *) errhp);
    
        (void) OCIHandleAlloc((dvoid *) envhp, (dvoid **)&authp,
                              (ub4) OCI_HTYPE_SESSION, (size_t) 0, (dvoid **) 0);
        
        (void) OCIAttrSet((dvoid *) authp, (ub4) OCI_HTYPE_SESSION,
                          (dvoid *) username, (ub4) strlen((char *)username),
                          (ub4) OCI_ATTR_USERNAME, errhp);
        
        (void) OCIAttrSet((dvoid *) authp, (ub4) OCI_HTYPE_SESSION,
                          (dvoid *) password, (ub4) strlen((char *)password),
                          (ub4) OCI_ATTR_PASSWORD, errhp);
    
        status = OCISessionBegin ( svchp,  errhp, authp, OCI_CRED_RDBMS,
                                          (ub4) OCI_DEFAULT);
        if (status == OCI_ERROR) {
            (void) OCIErrorGet((dvoid *)errhp, (ub4) 1, (text *) NULL, &errcode,
                           errbuf, (ub4) sizeof(errbuf), OCI_HTYPE_ERROR);
            (void) printf("Error - %.*s\n", 512, errbuf);
        }

    
        (void) OCIAttrSet((dvoid *) svchp, (ub4) OCI_HTYPE_SVCCTX,
                          (dvoid *) authp, (ub4) 0,
                          (ub4) OCI_ATTR_SESSION, errhp);
        

        status = OCIHandleAlloc( (dvoid *) envhp, (dvoid **) &inserthp,
                                        OCI_HTYPE_STMT, (size_t) enamelen + 2,
                                        (dvoid **) &ename);
        if (status == OCI_ERROR) {
            (void) OCIErrorGet((dvoid *)errhp, (ub4) 1, (text *) NULL, &errcode,
                           errbuf, (ub4) sizeof(errbuf), OCI_HTYPE_ERROR);
            (void) printf("Error - %.*s\n", 512, errbuf);
        }

        status = OCIStmtPrepare(stmthp, errhp, q,
                                       (ub4) strlen((char *) q),
                                       (ub4) OCI_NTV_SYNTAX, (ub4) OCI_DEFAULT);
        if (status == OCI_ERROR) {
            (void) OCIErrorGet((dvoid *)errhp, (ub4) 1, (text *) NULL, &errcode,
                           errbuf, (ub4) sizeof(errbuf), OCI_HTYPE_ERROR);
            (void) printf("Error - %.*s\n", 512, errbuf);
        }


        /*  Bind the placeholders in the INSERT statement. */
        if ((status = OCIBindByName(stmthp, &bnd1p, errhp, (text *) ":ENAME",
                                    -1, (dvoid *) ename,
                                    enamelen+1, SQLT_STR, (dvoid *) 0,
                                    (ub2 *) 0, (ub2 *) 0, (ub4) 0, (ub4 *) 0, OCI_DEFAULT)))
        {
            if (status == OCI_ERROR) {
                (void) OCIErrorGet((dvoid *)errhp, (ub4) 1, (text *) NULL, &errcode,
                           errbuf, (ub4) sizeof(errbuf), OCI_HTYPE_ERROR);
                (void) printf("Error - %.*s\n", 512, errbuf);
            }

            if (envhp)
                (void) OCIHandleFree((dvoid *) envhp, OCI_HTYPE_ENV);
        }

        /* FLAW */
        if ((status = OCIStmtExecute(svchp, stmthp, errhp, (ub4) 1, (ub4) 0,
                                     (CONST OCISnapshot *) NULL, (OCISnapshot *) NULL, OCI_DEFAULT))
            && status != 1)
        {
            if (status == OCI_ERROR) {
                (void) OCIErrorGet((dvoid *)errhp, (ub4) 1, (text *) NULL, &errcode,
                           errbuf, (ub4) sizeof(errbuf), OCI_HTYPE_ERROR);
                (void) printf("Error - %.*s\n", 512, errbuf);
            }
            if (envhp)
                (void) OCIHandleFree((dvoid *) envhp, OCI_HTYPE_ENV);
        }
        
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
    C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_bad();
    printLine("Finished bad()");
#endif /* OMITBAD */
    return 0;
}

#endif
