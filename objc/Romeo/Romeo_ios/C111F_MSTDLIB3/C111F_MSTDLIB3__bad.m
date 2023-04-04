//
//  C111F_MSTDLIB3__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/27.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C111F_MSTDLIB3.h"

@implementation C111F_MSTDLIB3__bad : NSObject

-(void) bad{
    int *boo;
    boo = (int*) malloc(1024 * sizeof(int)); // Noncompliant
}

@end
