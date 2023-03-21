//
//  C0001_CWE89_SQL_Injection__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2017. 12. 27..
//  Copyright © 2017년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C0001_CWE89_SQL_Injection__simple_01.h"

@implementation C0001_CWE89_SQL_Injection__simple_01 : NSObject

-(void) bad:(sqlite3 *)db atId:(NSString *)atId {
	
    NSString *docsDir;
	NSArray *dirPaths;
    
    dirPaths = NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES);
    docsDir = dirPaths[0];
    
    // Build the patth to the database file
    NSString *databasePath = [[NSString alloc] initWithString:[docsDir stringByAppendingPathComponent:@"contacts.db"]];
    
    NSFileManager *fileManager = [NSFileManager defaultManager];
    
    if([fileManager fileExistsAtPath:databasePath] == YES)
    {
        const char *dbpath = [databasePath UTF8String];
        if(sqlite3_open(dbpath, &db) == SQLITE_OK)
        {
            char *errMsg;
            // NSString *atId = @" ' or '' = '";
            NSString *sql = [NSString stringWithFormat:@"SELECT * FROM products WHERE id = '%@'", atId];
            const char *query = [sql UTF8String];
            
            // Flaw:
            if(sqlite3_exec(db, query, 0, 0, &errMsg) != SQLITE_OK)
            {
                printf("msg1: %s", errMsg);
            }
            
            sqlite3_close(db);
        }
    }
}

-(void) good:(sqlite3 *)db atId:(NSString *)atId {
    sqlite3_stmt *sql_statement;

    const char *sql = "SELECT name FROM products WHERE id = ?";

    if(sqlite3_prepare_v2(db, sql, -1, &sql_statement, NULL) == SQLITE_OK) {
        sqlite3_bind_text(sql_statement, 1, [atId UTF8String], -1, SQLITE_TRANSIENT);
        if(sqlite3_step(sql_statement) == SQLITE_ROW)
        {
            // do something
            const char * column = (const char *) sqlite3_column_text(sql_statement, 0);
        }
        sqlite3_finalize(sql_statement);
    }
    sqlite3_close(db);
}

@end
