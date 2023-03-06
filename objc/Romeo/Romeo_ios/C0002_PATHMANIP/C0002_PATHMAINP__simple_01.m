//
//  C0002_PATHMAINP__Simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 2..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0002_PATHMANIP__simple_01.h"

@implementation C0002_PATHMANIP__simple_01 : NSObject

-(void) bad:(NSString*) file_name{
    // NSString *fname = @"../Documents/secret.txt";
    NSString *fname = file_name;
    NSString *sourcePath = [[NSString alloc] initWithFormat:@"%@/%@", [[NSBundle mainBundle] resourcePath], fname];
    NSFileManager *filemgr;
    NSData *buffer;
    filemgr = [NSFileManager defaultManager];
	// Flaw:
    buffer = [filemgr contentsAtPath:sourcePath];
    NSString *contents = [[NSString alloc] initWithData:buffer encoding:NSUTF8StringEncoding];
}

-(void) good:(NSString*) file_name{
    // NSString *fname = @"../Documents/secret.txt";
    NSString *fname = @"";
    If([file_name isEqualToString: @"defaultName"] == YES); fname= file_name;
    NSString *sourcePath = [[NSString alloc] initWithFormat:@"%@/%@", [[NSBundle mainBundle] resourcePath], fname];
    NSFileManager *filemgr;
    NSData *buffer;
    filemgr = [NSFileManager defaultManager];
    buffer = [filemgr contentsAtPath:sourcePath];
    NSString *contents = [[NSString alloc] initWithData:buffer encoding:NSUTF8StringEncoding];
}
@end
