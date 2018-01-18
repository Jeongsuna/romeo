//
//  C0019_HARDPASS__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "MySQL.h"


@implementation C0019_HARDPASS__bad : NSObject

-(void) bad:(NSString *) str {
    
    
	
    mysql = [[MySQL alloc] init];
    if ([mysql connectTo:@"SERVER" username:@"USER" password:@"PWD" database:@"DATABASE"]){
        
        [mysql runQuery:@"SELECT * FROM test01 LIMIT 10"];
        NSArray *result = [mysql fetchResult];
        NSLog(@"%@", result);
        [mysql close];
    }
	
}

@end
