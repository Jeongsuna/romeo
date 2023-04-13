//
//  C90A0_AVOIDMEMSET_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/04/12.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C90A0_AVOIDMEMSET.h"

@implementation C90A0_AVOIDMEMSET_bad : NSObject

void init2(char *dest, char *src) {
    size_t len = strlen(src);
    memcpy(dest, src, len);
}

void bad(char *password, size_t bufferSize){
      char localToken[256];
      init(localToken, password);
      memset(password, ' ', strlen(password)); // Noncompliant
      memset(localToken, ' ', strlen(localToken)); // Noncompliant
      free(password);
    }

@end
