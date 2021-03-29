#include <stdio.h>
#include <Windows.h>
#include <Winldap.h>

#define FIND_DN "uid=han,ou=staff,dc=example,dc=com"

int searchData2LDAP(LDAP* ld, char* username) {
	unsigned long rc;
	char filter[20];
	LDAPMessage* result;
	// 사용자 인증이 성공적으로 끝나면, 어떤 LDAP 검색도 가능하도록 구성되어 있다.
	// 또한 사용자의 로그인 정보와 파라미터로 넘어오는 username에 대한 비교가 없기 때문에 타인의 정보를 볼 수 있다.
	snprintf(filter, sizeof(filter), "(name=%s)", username);
	rc = ldap_search_ext_s(ld, (PWSTR)FIND_DN, LDAP_SCOPE_BASE, (PWSTR)filter, NULL, 0, NULL,
		NULL, LDAP_NO_LIMIT, LDAP_NO_LIMIT, &result);
	return rc;
}
