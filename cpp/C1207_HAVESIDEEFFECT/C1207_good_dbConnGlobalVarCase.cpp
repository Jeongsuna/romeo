#include <stdio.h>
#include <sqlite3.h>
#include <occi.h>
#include <mysql_driver.h>
#include <mysql_connection.h>
#include <pqxx/pqxx>

using namespace oracle::occi;
using namespace sql::mysql;
extern sqlite3* db;
extern Environment *env = Environment::createEnvironment();
extern MySQL_Driver *driver = get_mysql_driver_instance();
extern pqxx::connection c{"dbname=test user=postgres password=secret"};

void sqlite() {


    char* err_msg = 0;
    int rc = sqlite3_open("test.db", &db);
    if (rc != SQLITE_OK) {
        std::cout << "Cannot open database: " << sqlite3_errmsg(db);
        sqlite3_close(db);
        return;
  }
}

void connect_to_oracle() {

    string user = "username";
    string pass = "password";
    string constr = "localhost:1521/orcl";
    Connection *conn = env->createConnection(user, pass, constr);

    Statement *stmt = conn->createStatement("SELECT sysdate FROM dual");
    ResultSet *rs = stmt->executeQuery();

    while (rs->next())
        cout << "Current date is: " << rs->getString(1) << endl;

    stmt->closeResultSet(rs);
    conn->terminateStatement(stmt);
    env->terminateConnection(conn);
    Environment::terminateEnvironment(env);
}

void connect_to_mysql() {
    sql::Connection *con;

    con = driver->connect("tcp://127.0.0.1:3306", "user", "password");

    delete con;
}

void connect_to_postgresql() {
    pqxx::work txn{c};
    pqxx::result r = txn.exec("SELECT NOW()");

    std::cout << r[0][0].c_str() << std::endl;

    txn.commit();
}


