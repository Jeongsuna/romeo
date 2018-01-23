//
//  test.m
//  test
//
//  Created by HyoBeom on 2018. 1. 19..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>



int main (int argc, const char * argv[])
{
    char data[10] ;
    int num = 1111;
    
    //fix:
    snprintf(data, sizeof(data) ,"num : %d", num);
    
    NSLog(@"%s\n",data);
    
    return 0;
}
