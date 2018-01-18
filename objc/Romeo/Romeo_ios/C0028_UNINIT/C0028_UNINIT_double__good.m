//
//  main.m
//  test
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>


int main(int argc, const char * argv[]) {
    
    /* FIX: Ensure data is initialized before use */
    double data = 0;
    
    @autoreleasepool {

        NSLog([NSString stringWithFormat:@"%f",data]);
    }
    
    return 0;
}
