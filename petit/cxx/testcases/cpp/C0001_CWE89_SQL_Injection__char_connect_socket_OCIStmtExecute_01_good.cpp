/*
Filename : C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_good.cpp
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
        text errbuf[512];
        text *username = (text *) "orcl2";
        text *password = (text *) "Tigerteam1";

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

        sprintf(q, "insert into users (ID,name) values ('5','%s')", data);
        
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

        status = OCIStmtPrepare(stmthp, errhp, (OraText*) q,
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

void C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_good()
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
    C0001_CWE89_SQL_Injection__char_connect_socket_OCIStmtExecute_01_good();
    printLine("Finished good()");
#endif /* OMITGOOD */
    return 0;
}

#endif
