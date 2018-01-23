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
    char data1[2] ="a";
    char data2[5] ="test";
    
    //fix:
    int idx = sizeof(data2) - strlen(data1) - strlen(data2) ;
    if(idx < 0 ) idx = 0;
    
    strncat(data2, data1, idx);
    
    NSLog(@"%s\n",data1);
    NSLog(@"%s\n",data2);
    
    
    return 0;
}
