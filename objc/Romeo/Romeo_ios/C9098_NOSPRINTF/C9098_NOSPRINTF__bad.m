//
//  C9098_NOSPRINTF__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/23.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9098_NOSPRINTF.h"

@implementation C9098_NOSPRINTF__bad : NSObject

-(void)bad{
    char *foo = "string";
    sprintf(foo, "%s", "msg"); // Noncompliant
}

@end
