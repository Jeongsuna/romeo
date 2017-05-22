#include <oratypes.h>
#include <ocidfn.h>

#define OCIEnv void
#define OCIServer void
#define OCIError void
#define OCIStmt void
#define OCISession void
#define OCISvcCtx void
#define OCIBind void
#define OCISnapshot void
/*

#define OCIDefine void

#define OCIUcb void

#define OCILobRegion void
#define OCIAQMsgProperties void
#define OCIType void

#define OCIEvent void


#define OCISnapshot void
#define OCIRowid void
#define OCIDescribe void
#define OCITrans void

#define OCILobLocator void
#define OCIDuration void
#define Lda_Def void
#define OCIResult void
*/

/*-----------------------------Handle Types----------------------------------*/
                                           /* handle types range from 1 - 49 */
#define OCI_HTYPE_FIRST          1             /* start value of handle type */
#define OCI_HTYPE_ENV            1                     /* environment handle */
#define OCI_HTYPE_ERROR          2                           /* error handle */
#define OCI_HTYPE_SVCCTX         3                         /* service handle */
#define OCI_HTYPE_STMT           4                       /* statement handle */
#define OCI_HTYPE_BIND           5                            /* bind handle */
#define OCI_HTYPE_DEFINE         6                          /* define handle */
#define OCI_HTYPE_DESCRIBE       7                        /* describe handle */
#define OCI_HTYPE_SERVER         8                          /* server handle */
#define OCI_HTYPE_SESSION        9                  /* authentication handle */
#define OCI_HTYPE_AUTHINFO      OCI_HTYPE_SESSION  /* SessionGet auth handle */
#define OCI_HTYPE_TRANS         10                     /* transaction handle */
#define OCI_HTYPE_COMPLEXOBJECT 11        /* complex object retrieval handle */
#define OCI_HTYPE_SECURITY      12                        /* security handle */
#define OCI_HTYPE_SUBSCRIPTION  13                    /* subscription handle */
#define OCI_HTYPE_DIRPATH_CTX   14                    /* direct path context */
#define OCI_HTYPE_DIRPATH_COLUMN_ARRAY 15        /* direct path column array */
#define OCI_HTYPE_DIRPATH_STREAM       16              /* direct path stream */
#define OCI_HTYPE_PROC                 17                  /* process handle */
#define OCI_HTYPE_DIRPATH_FN_CTX       18    /* direct path function context */
#define OCI_HTYPE_DIRPATH_FN_COL_ARRAY 19          /* dp object column array */
#define OCI_HTYPE_XADSESSION    20                  /* access driver session */
#define OCI_HTYPE_XADTABLE      21                    /* access driver table */
#define OCI_HTYPE_XADFIELD      22                    /* access driver field */
#define OCI_HTYPE_XADGRANULE    23                  /* access driver granule */
#define OCI_HTYPE_XADRECORD     24                   /* access driver record */
#define OCI_HTYPE_XADIO         25                      /* access driver I/O */
#define OCI_HTYPE_CPOOL         26                 /* connection pool handle */
#define OCI_HTYPE_SPOOL         27                    /* session pool handle */
#define OCI_HTYPE_ADMIN         28                           /* admin handle */
#define OCI_HTYPE_EVENT         29                        /* HA event handle */

#define OCI_HTYPE_LAST          29            /* last value of a handle type */

#define OCI_DEFAULT         0x00000000 

#define OCI_ATTR_SERVER 6                               /* the server handle */
#define OCI_ATTR_SESSION 7                        /* the user session handle */
#define OCI_ATTR_USERNAME 22                           /* username attribute */
#define OCI_ATTR_PASSWORD 23                           /* password attribute */

#define OCI_CRED_RDBMS      1                  /* database username/password */

#define OCI_ERROR -1                                    /* maps to SQL_ERROR */

#define OCI_NTV_SYNTAX 1    /* Use what so ever is the native lang of server */


#include <ociap.h>