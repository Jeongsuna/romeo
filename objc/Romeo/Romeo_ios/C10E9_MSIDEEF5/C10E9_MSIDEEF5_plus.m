//
//  C10E9_MSIDEEF5_plus.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/08.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad() {
    Boolean isHigh = false;
    int x = 0;
    
    for(int i = 0; i < 100;){
        x += 1;
        if(x>80){
            isHigh = true;
        }
        
        if (isHigh && (x == i++)) { // Noncompliant
            NSLog(@"Noncompliant");
        }
    }
}

void good() {
    Boolean isHigh = false;
    int x = 0;
    
    for(int i = 1; i < 100; i++){
        x += 1;
        if(x>80){
            isHigh = true;
        }
        
        if (isHigh && (x == i)) { // compliant
            NSLog(@"x : %d",x);
        }
    }
}


