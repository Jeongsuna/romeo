//
//  C90A9_USEDEFINED_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/12.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#if defined(X > Y)  // Noncompliant
void bad(int argc, const char * argv[]) {
    NSLog(@"X is greater than Y");
}

#endif
