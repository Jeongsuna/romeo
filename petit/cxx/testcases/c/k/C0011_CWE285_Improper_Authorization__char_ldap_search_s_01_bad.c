/*
Filename : C0011_CWE285_Improper_Authorization__char_ldap_search_s_01_bad.c
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


#include <WinLdap.h>
#include <stdio.h>
#define MY_HOST "127.0.0.1"
#define MY_PORT 19201
#define MY_SEARCHBASE "ou=People,dc=example,dc=com"
#define MY_FILTER "(manager=John)"
#define USERNAME "USER"



#ifndef OMITBAD

static void C0011_CWE285_Improper_Authorization__char_ldap_search_s_01_bad()
{
    char * data;
    char data_buf[100] = "";
    data = data_buf;
    strcat(data, MY_FILTER);

    {
        LDAP *ld;
        LDAPMessage *result, *e;
        BerElement *ber;
        char *a, *dn;
        char **vals;
        int i;

		/* FLAW */
		snprintf(MY_FILTER, sizeof(MY_FILTER),"(name=%s)",USERNAME);
        
        /* get a handle to an LDAP connection */
        if ( (ld = ldap_init( MY_HOST, MY_PORT )) == NULL ) {
            perror( "ldap_init" );
        }
        
        /* authenticate to the directory as nobody */
        if ( ldap_simple_bind_s( ld, NULL, NULL ) != LDAP_SUCCESS ) {
            ldap_perror( ld, "ldap_simple_bind_s" );
            ldap_unbind( ld );
        }
        
        /* search for all entries with surname of Jensen */
		/* FLAW */
        if ( ldap_search_s( ld, MY_SEARCHBASE, LDAP_SCOPE_SUBTREE,
                            data, NULL, 0, &result ) != LDAP_SUCCESS ) {
            ldap_perror( ld, "ldap_search_s" );
            if ( result == NULL ) {
                ldap_unbind( ld );            
            }
            
        }
        
        /* for each entry print out name + all attrs and values */
        for ( e = ldap_first_entry( ld, result ); e != NULL;
              e = ldap_next_entry( ld, e ) ) {
            if ( (dn = ldap_get_dn( ld, e )) != NULL ) {
                printf( "dn: %s\n", dn );
                ldap_memfree( dn );
            }
            
            for ( a = ldap_first_attribute( ld, e, &ber );
                  a != NULL; a = ldap_next_attribute( ld, e, ber ) )
            {
                if ((vals = ldap_get_values( ld, e, a)) != NULL ) {
                    for ( i = 0; vals[i] != NULL; i++ ) {
                        printf( "%s: %s\n", a, vals[i] );
                        
                    }
                    
                    ldap_value_free( vals );
                }
                ldap_memfree( a );
            }
            
            if ( ber != NULL ) {
                ber_free( ber, 0 );   
            }
            printf( "\n" );
        }
        
        ldap_msgfree( result ); 
        ldap_unbind( ld );
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
    printLine("Calling good()...");
    C0011_CWE285_Improper_Authorization__char_ldap_search_s_01_bad();
    printLine("Finished good()");
#endif /* OMITBAD */
    return 0;
}

#endif
