//
//  C90A8_NESTSWITCH.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(int argc, const char * argv[]) {
    @autoreleasepool {
        int x = 1;
        BOOL foo = YES;
        
        switch (x) {
            case 1:
                if (foo) {
                    case 2: // Noncompliant
                        NSLog(@"Case 2");
                        break;
                    case 3: // Noncompliant
                        NSLog(@"nested switch");
                        break;
                }
                NSLog(@"Case 1");
                break;
            default:
                NSLog(@"Default");
                break;
        }
    }

}

void good(int argc, const char * argv[]) {
    @autoreleasepool {
        int x = 1;
        BOOL foo = YES;
        
        switch (x) {
            case 1:
                if (foo) {
                    NSLog(@"Case 1");
                    break;
                } else {
                    
                }
            case 2: // compliant
                NSLog(@"Case 2");
                break;
                
            case 3: // compliant
                NSLog(@"Case 3");
                break;
                
            default:
                NSLog(@"Default");
                break;
        }
    }

}


