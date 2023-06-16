//
//  C90AA_USEDEFINED_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/12.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#define X 10
#define Y 5

#if defined(X) && defined(Y) && X > Y   //Compliant
void good(int argc, const char * argv[]) {
    NSLog(@"X is greater than Y");
}
#endif
