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
    Boolean isExist= false;
    str = (char*)malloc(20*sizeof(char));
    strcpy(str, "Search Me!");

    while( *str != NULL){
        
            if( *str == c ){
                free(str);
                isExist=true;
                break;
            }
        
            //flaw: release of invalid pointer
            str = str + 1;
    }
    
    if(!isExist){
        free(str);
    }
    
    @autoreleasepool {
        NSLog(@"%@",isExist ? @"yes" : @"no");
    }
    
    
    return 0;
}
