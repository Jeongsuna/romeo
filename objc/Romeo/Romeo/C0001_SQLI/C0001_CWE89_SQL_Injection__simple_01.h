//
//  C0001_CWE89_SQL_Injection__simple_01.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 2..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0001_CWE89_SQL_Injection__simple_01_h
#define C0001_CWE89_SQL_Injection__simple_01_h
#import <sqlite3.h>

@interface C0001_CWE89_SQL_Injection__simple_01 : NSObject
-(void) bad:(sqlite3 *)db atId:(NSString *)atId;
-(void) good:(sqlite3 *)db atId:(NSString *)atId;
@end
#endif /* C0001_CWE89_SQL_Injection__simple_01_h */
