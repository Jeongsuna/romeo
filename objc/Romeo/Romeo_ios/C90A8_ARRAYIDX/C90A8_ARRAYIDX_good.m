//
//  C90A8_ARRAYIDX_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/12.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void doStuff(int value) {
    NSLog(@"Doing stuff with value: %d", value);
}

void good(int argc, const char *argv[]) {
    
        int arr[] = {1, 2, 3, 4, 5};
        int i = 2;
        int *P1 = &arr[0];
    
        P1[10] = 0; // Compliant
        doStuff(arr[i]); // Compliant
    
        NSLog(@"arr[2]: %d", arr[2]);
        
}
