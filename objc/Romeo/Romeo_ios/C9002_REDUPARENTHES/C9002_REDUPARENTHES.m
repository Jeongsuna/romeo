//
//  C9002_REDUPARENTHES.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/08.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int bad(int argc, const char * argv[]) {
    @autoreleasepool {
        int y = 0;
        int a = 1;
        int x = (y / 2 + 1);   // Compliant
        
        if (a && ((x+y > 0))) {  // Noncompliant
            NSLog(@"This condition is true");
        }

        return ((x + 1));  // Noncompliant
    }
}

int good(int argc, const char * argv[]) {
    @autoreleasepool {
        int y = 0;
        int a = 1;
        int x = (y / 2 + 1);   // Compliant
        
        if (a && (x+y > 0)) {  // Compliant
            NSLog(@"This condition is true");
        }

        return (x + 1);  // Compliant
    }
}

