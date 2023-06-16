//
//  C1094_MCODEDES4_cal.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/08.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(int argc, const char * argv[]) {
    
        int x = 10;
     // int y = 20;
    
        /*
         for (int i = 0; i < 10; i++) {
        
            int sum = x + y;
            NSLog(@"%d", sum);
        
            x += 2;
            y += 1;
            
        }
        */
    
        NSLog(@"%d", x);
}



void good(int argc, const char * argv[]) {
    
        int x = 10;
        int y = 20;
        
        
        for (int i = 0; i < 10; i++) {
            
            int sum = x + y;
            NSLog(@"%d", sum);
            
            x += 2;
            y += 1;
            
        }
   
}

