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
    char data[256];
    
    fgets(data,sizeof(data),stdin);
    
    //flaw:
    NSLog(@"%s\n",data);
    
    return 0;
}
