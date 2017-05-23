
typedef struct Mysql {} MYSQL;
MYSQL *mysql_init(MYSQL *mysql);
int mysql_query(MYSQL *mysql, const char *stmt_str);
void mysql_close(MYSQL *mysql);
MYSQL *mysql_real_connect(MYSQL *mysql, const char *host, const char *user, const char *passwd, const char *db, unsigned int port, const char *unix_socket, unsigned long client_flag);