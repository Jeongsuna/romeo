//
//  C0019_HARDPASS__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

int main(int argc, const char * argv[]) {

    @try {
        
        NSString *string =
        [NSString stringWithContentsOfFile:
         [[NSBundle mainBundle]pathForResource:@"file" ofType:@"txt"]];
        
        NSArray *array = [string componentsSeparatedByCharactersInSet:[NSCharacterSet newlineCharacterSet]];

        NSString *result = [NSString stringWithFormat: @"%@", [array objectAtIndex:0]];
    }
    
    @catch (NSException * e) {
        
        /* FLAW: exposure of system data to an unauthorized control sphere */
        NSLog(@"Error: %@%@", [e name], [e reason]);
        
    }
    
    @finally {
        NSLog(@"Finally executes no matter what");
    }
    
    return 0;
}
