//
//  C9098_NOSPRINTF__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/23.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9098_NOSPRINTF.h"

@implementation C9098_NOSPRINTF__good : NSObject

-(void)good{
    char* foo = "string";
    snprintf(foo, sizeof(foo), "%s", "msg"); // Prevent overflows by enforcing a maximum size for `foo` buffer
}

-(void)except{
    size_t fooLen = snprintf(0, 0, "%s", "msg");
    char* foo = malloc(fooLen + 1); // For the final 0
    sprintf(foo, "%s", "msg");
}

@end
