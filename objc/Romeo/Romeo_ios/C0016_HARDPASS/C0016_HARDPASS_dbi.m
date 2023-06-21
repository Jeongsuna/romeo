//
//  C0016_HARDPASS_dbi.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/16.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <dbi/dbi.h>
#import <sqlite3.h>

char* getDatabasePassword(void) {
    sqlite3 *db;
    char *password = NULL;
    NSString *dbPath = @"dbpath";
    
    if(sqlite3_open([dbPath UTF8String], &db) == SQLITE_OK) {
        NSString *query = @"SELECT password FROM Users WHERE id = 1"; // 적절한 쿼리 작성
        sqlite3_stmt *statement;

        if (sqlite3_prepare_v2(db, [query UTF8String], -1, &statement, NULL) == SQLITE_OK) {
            if (sqlite3_step(statement) == SQLITE_ROW) {
                password = (char*)sqlite3_column_text(statement, 0);
            }
            sqlite3_finalize(statement);
        }
        sqlite3_close(db);
    }

    return password;
}

void bad() {
    dbi_conn conn = dbi_conn_new("mysql");
    char *password = "secret"; // Noncompliant
    dbi_conn_set_option(conn, "password", password);
}

void good() {
    dbi_conn conn = dbi_conn_new("mysql");
    char *password = getDatabasePassword(); // Compliant
    dbi_conn_set_option(conn, "password", password); // Compliant
}


