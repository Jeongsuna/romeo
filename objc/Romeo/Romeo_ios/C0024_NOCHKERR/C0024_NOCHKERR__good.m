//
//  C0024_NOCHKERR__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0024_NOCHKERR.h"

@implementation C0024_NOCHKERR_good : NSObject

    -(void) good:(NSArray *) arr {
    
        @try {
            
            NSString *result = [NSString stringWithFormat: @"%@", [arr objectAtIndex:0]];
        
        }
        @catch (NSException * e) {
    
            /* FIX: precise Exception Handling */
            if([@"NSRangeException" isEqualToString:[e name]]){
                NSString *result = @"defaultString";
                NSLog(@"Error : NSRangeException");
            }else{
                NSString *result = @"";
                NSLog(@"Error : Unknown Exception");
            }
    
        }
        @finally {
            NSLog(@"Finally executes no matter what");
        }
    }

@end

