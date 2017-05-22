sword   OCIEnvCreate (OCIEnv **envp, ub4 mode, void  *ctxp,
                 void  *(*malocfp)(void  *ctxp, size_t size),
                 void  *(*ralocfp)(void  *ctxp, void  *memptr, size_t newsize),
                 void   (*mfreefp)(void  *ctxp, void  *memptr),
                 size_t xtramem_sz, void  **usrmempp);

sword   OCIHandleAlloc(const void  *parenth, void  **hndlpp, const ub4 type, 
                       const size_t xtramem_sz, void  **usrmempp);

sword   OCIServerAttach  (OCIServer *srvhp, OCIError *errhp,
                          const OraText *dblink, sb4 dblink_len, ub4 mode);

sword   OCIAttrSet (void  *trgthndlp, ub4 trghndltyp, void  *attributep,
                    ub4 size, ub4 attrtype, OCIError *errhp);

sword   OCIErrorGet   (void  *hndlp, ub4 recordno, OraText *sqlstate,
                       sb4 *errcodep, OraText *bufp, ub4 bufsiz, ub4 type);

sword   OCIStmtPrepare   (OCIStmt *stmtp, OCIError *errhp, const OraText *stmt,
                          ub4 stmt_len, ub4 language, ub4 mode);

sword   OCIStmtPrepare   (OCIStmt *stmtp, OCIError *errhp, const char* stmt,
                          ub4 stmt_len, ub4 language, ub4 mode);

sword   OCISessionBegin  (OCISvcCtx *svchp, OCIError *errhp, OCISession *usrhp,
                          ub4 credt, ub4 mode);

sword   OCIHandleFree(void  *hndlp, const ub4 type);

sword   OCIBindByName   (OCIStmt *stmtp, OCIBind **bindp, OCIError *errhp,
                         const OraText *placeholder, sb4 placeh_len, 
                         void  *valuep, sb4 value_sz, ub2 dty, 
                         void  *indp, ub2 *alenp, ub2 *rcodep, 
                         ub4 maxarr_len, ub4 *curelep, ub4 mode);

sword   OCIStmtExecute  (OCISvcCtx *svchp, OCIStmt *stmtp, OCIError *errhp, 
                         ub4 iters, ub4 rowoff, const OCISnapshot *snap_in, 
                         OCISnapshot *snap_out, ub4 mode);