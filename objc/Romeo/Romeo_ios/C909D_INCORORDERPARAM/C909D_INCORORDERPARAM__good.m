//
//  C909D_INCORORDERPARAM__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909D_INCORORDERPARAM.h"

@implementation C909D_INCORORDERPARAM__good : NSObject

int divide(int foo_start, int foo_end){
  return foo_start / foo_end;
}

-(void) good{
    int foo_start = 15;
    int foo_end = 5;

    int result = divide(foo_start, foo_end);  // Compliant
}

@end
