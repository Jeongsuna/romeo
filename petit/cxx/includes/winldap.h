#define LDAP_SCOPE_BASE         0x00
#define LDAP_SCOPE_ONELEVEL     0x01
#define LDAP_SCOPE_SUBTREE      0x02

#define LDAP_PORT               389

#define LDAP_NO_LIMIT       0

typedef struct ldap {} LDAP;
typedef struct ldapmsg {} LDAPMessage, *PLDAPMessage;
typedef struct berelement {} BerElement;
typedef struct ldapcontrolA {} LDAPControlA, *PLDAPControlA;
typedef wchar_t *PWCHAR, *LPWCH, *PWCH;

typedef enum {
    LDAP_SUCCESS                    =   0x00,
    LDAP_OPERATIONS_ERROR           =   0x01,
    LDAP_PROTOCOL_ERROR             =   0x02,
    LDAP_TIMELIMIT_EXCEEDED         =   0x03,
    LDAP_SIZELIMIT_EXCEEDED         =   0x04,
    LDAP_COMPARE_FALSE              =   0x05,
    LDAP_COMPARE_TRUE               =   0x06,
    LDAP_AUTH_METHOD_NOT_SUPPORTED  =   0x07,
    LDAP_STRONG_AUTH_REQUIRED       =   0x08,
    LDAP_REFERRAL_V2                =   0x09,
    LDAP_PARTIAL_RESULTS            =   0x09,
    LDAP_REFERRAL                   =   0x0a,
    LDAP_ADMIN_LIMIT_EXCEEDED       =   0x0b,
    LDAP_UNAVAILABLE_CRIT_EXTENSION =   0x0c,
    LDAP_CONFIDENTIALITY_REQUIRED   =   0x0d,
    LDAP_SASL_BIND_IN_PROGRESS      =   0x0e,

    LDAP_NO_SUCH_ATTRIBUTE          =   0x10,
    LDAP_UNDEFINED_TYPE             =   0x11,
    LDAP_INAPPROPRIATE_MATCHING     =   0x12,
    LDAP_CONSTRAINT_VIOLATION       =   0x13,
    LDAP_ATTRIBUTE_OR_VALUE_EXISTS  =   0x14,
    LDAP_INVALID_SYNTAX             =   0x15,

    LDAP_NO_SUCH_OBJECT             =   0x20,
    LDAP_ALIAS_PROBLEM              =   0x21,
    LDAP_INVALID_DN_SYNTAX          =   0x22,
    LDAP_IS_LEAF                    =   0x23,
    LDAP_ALIAS_DEREF_PROBLEM        =   0x24,

    LDAP_INAPPROPRIATE_AUTH         =   0x30,
    LDAP_INVALID_CREDENTIALS        =   0x31,
    LDAP_INSUFFICIENT_RIGHTS        =   0x32,
    LDAP_BUSY                       =   0x33,
    LDAP_UNAVAILABLE                =   0x34,
    LDAP_UNWILLING_TO_PERFORM       =   0x35,
    LDAP_LOOP_DETECT                =   0x36,
    LDAP_SORT_CONTROL_MISSING       =   0x3C,
    LDAP_OFFSET_RANGE_ERROR         =   0x3D,

    LDAP_NAMING_VIOLATION           =   0x40,
    LDAP_OBJECT_CLASS_VIOLATION     =   0x41,
    LDAP_NOT_ALLOWED_ON_NONLEAF     =   0x42,
    LDAP_NOT_ALLOWED_ON_RDN         =   0x43,
    LDAP_ALREADY_EXISTS             =   0x44,
    LDAP_NO_OBJECT_CLASS_MODS       =   0x45,
    LDAP_RESULTS_TOO_LARGE          =   0x46,
    LDAP_AFFECTS_MULTIPLE_DSAS      =   0x47,
    
    LDAP_VIRTUAL_LIST_VIEW_ERROR    =   0x4c,

    LDAP_OTHER                      =   0x50,
    LDAP_SERVER_DOWN                =   0x51,
    LDAP_LOCAL_ERROR                =   0x52,
    LDAP_ENCODING_ERROR             =   0x53,
    LDAP_DECODING_ERROR             =   0x54,
    LDAP_TIMEOUT                    =   0x55,
    LDAP_AUTH_UNKNOWN               =   0x56,
    LDAP_FILTER_ERROR               =   0x57,
    LDAP_USER_CANCELLED             =   0x58,
    LDAP_PARAM_ERROR                =   0x59,
    LDAP_NO_MEMORY                  =   0x5a,
    LDAP_CONNECT_ERROR              =   0x5b,
    LDAP_NOT_SUPPORTED              =   0x5c,
    LDAP_NO_RESULTS_RETURNED        =   0x5e,
    LDAP_CONTROL_NOT_FOUND          =   0x5d,
    LDAP_MORE_RESULTS_TO_RETURN     =   0x5f,

    LDAP_CLIENT_LOOP                =   0x60,
    LDAP_REFERRAL_LIMIT_EXCEEDED    =   0x61
} LDAP_RETCODE;

ULONG ldap_connect(LDAP* ld, struct l_timeval* timeout);
ULONG ldap_msgfree(LDAPMessage* res);
ULONG ldap_unbind(LDAP* ld);
LDAP* ldap_initA(const PSTR HostName, ULONG PortNumber);
ULONG ldap_search_ext_sA(
        LDAP                    *ld,
        const PSTR     base,
        ULONG                   scope,
        const PSTR         filter,
        PZPSTR             attrs,
        ULONG                   attrsonly,
        PLDAPControlA  *ServerControls,
        PLDAPControlA  *ClientControls,
        struct l_timeval        *timeout,
        ULONG                   SizeLimit,
        PLDAPMessage    *res
    );