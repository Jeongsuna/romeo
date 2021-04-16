#include <cstdlib>
#include <iostream>
#include <ldap.h>

int C0009_LDAP() {
	char* filter = getenv("filter_string");
	int rc;
	int FIND_DN = 0;
	LDAP* ld = NULL;
	LDAPMessage* result;
    int ldap_scope_base = 0;
	rc = ldap_search_ext_s(ld, FIND_DN, ldap_scope_base, filter, NULL, 0,
		NULL, NULL, LDAP_NO_LIMIT, LDAP_NO_LIMIT, &result);
	return 0;
}

