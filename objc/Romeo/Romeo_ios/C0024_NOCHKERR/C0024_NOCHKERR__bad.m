//
//  C0024_NOCHKERR__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0024_NOCHKERR.h"

@implementation C0024_NOCHKERR_bad : NSObject

    -(void) bad:(NSArray *) arr {
    
        @try {
            
            NSString *result = [NSString stringWithFormat: @"%@", [arr objectAtIndex:11]];
        
        }
        @catch (NSException *e) {
    
            /* FLAW: unprecise Exception Handling */
            NSString *result = @"defaultString";
            NSLog(@"Error : NSRangeException");
    
        }
        @finally {
            NSLog(@"Finally executes no matter what");
        }
    }

@end

