//
//  C909D_INCORORDERPARAM__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909D_INCORORDERPARAM.h"

@implementation C909D_INCORORDERPARAM__bad : NSObject

int divide(int foo_start, int foo_end){
  return foo_start / foo_end;
}

-(void) bad{
    int foo_start = 15;
    int foo_end = 5;

    int result = divide(foo_end, foo_start);  // Noncompliant
}

@end
