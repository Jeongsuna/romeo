//
//  main.m
//  Romeo
//
//  Created by Jemin Kim on 2017. 12. 27..
//  Copyright © 2017년 Jemin Kim. All rights reserved.
//

#import <Cocoa/Cocoa.h>
#import <sqlite3.h>

static int callback(void *data, int argc, char **argv, char **azColName){
    int i;
    //fprintf(stderr, "%s: ", (const char*)data);
    
    for(i = 0; i<argc; i++){
        printf("%s = %s\n", azColName[i], argv[i] ? argv[i] : "NULL");
    }
    
    printf("\n");
    return 0;
}

int main(int argc, const char * argv[]) {
    NSString *docsDir;
    NSArray *dirPaths;
    sqlite3 *contactPath;
    
    dirPaths = NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES);
    docsDir = dirPaths[0];
    
    // Build the patth to the database file
    NSString *databasePath = [[NSString alloc] initWithString:[docsDir stringByAppendingPathComponent:@"contacts.db"]];
    
    NSFileManager *fileManager = [NSFileManager defaultManager];
    
    if([fileManager fileExistsAtPath:databasePath] == YES)
    {
        const char *dbpath = [databasePath UTF8String];
        if(sqlite3_open(dbpath, &contactPath) == SQLITE_OK)
        {
            char *errMsg;
            NSString *atId = @" ' or '' = '";
            NSString *sql = [NSString stringWithFormat:@"SELECT * FROM products WHERE id = '%@'", atId];
            // NSString *sql = @"CREATE TABLE products (name INT, id INT)";
            const char *query = [sql UTF8String];
            
            if(sqlite3_exec(contactPath, query, callback, NULL, &errMsg) != SQLITE_OK)
            {
                printf("msg1: %s", errMsg);
            }
            /*
            sql = @"INSERT INTO products (id, name) VALUES (2,2)";
            query = [sql UTF8String];
            if(sqlite3_exec(contactPath, query, NULL, NULL, &errMsg) != SQLITE_OK)
            {
                printf("msg2: %s", errMsg);
            }
             */
            sqlite3_close(contactPath);
        }
    }
    
    return NSApplicationMain(argc, argv);
}

