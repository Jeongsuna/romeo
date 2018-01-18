//
//  main.m
//  test
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    
    char c = 'G';
    char *str;
    int i = 0;
    Boolean isExist= false;
    str = (char*)malloc(20*sizeof(char));
    strcpy(str, "Search Me!");
    
    while( i < strlen(str) ){
        
            if( str[i] == c ){
                free(str);
                isExist=true;
                break;
            }
        
            //fix : release of valid pointer
            i = i + 1;
        }
    
    if(!isExist){
        free(str);
    }
    
    @autoreleasepool {
        NSLog(@"%@",isExist ? @"yes" : @"no");
    }
    
    
    return 0;
}
