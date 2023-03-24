//
//  C9097_PUBLICWRITABLEDIR__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9097_PUBLICWRITABLEDIR.h"

#include <cstdio>
#include <cstdlib>

@implementation C9097_PUBLICWRITABLEDIR__good

-(void)good{
   
    FILE * fp = tmpfile(); // Compliant

}

@end
