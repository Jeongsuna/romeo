//
//  main.m
//  test
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    
    char *str;
    Boolean isExist= true;
    str = (char*)malloc(20*sizeof(char));
 
    if(isExist) str =NULL;
    
    //flaw:
    free(str);

    
    return 0;
}
