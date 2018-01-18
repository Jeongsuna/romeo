//
//  main.m
//  test
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>


int main(int argc, const char * argv[]) {
    
  
    double data ;
    
    @autoreleasepool {
        /* FLAW: Use data without initializing it */
        NSLog([NSString stringWithFormat:@"%f",data]);
    }
    
    return 0;
}
