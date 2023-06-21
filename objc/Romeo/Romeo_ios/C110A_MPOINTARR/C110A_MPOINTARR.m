//
//  C110A_MPOINTARR.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/02.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C110A_MPOINTARR.h"

@implementation C110A_MPOINTARR

+ (int *)bad {
  int local_auto;
  return &local_auto; // Noncompliant
}

+ (int*) good {
  static int local_static;
  return &local_static; // Compliant
}
 


@end

