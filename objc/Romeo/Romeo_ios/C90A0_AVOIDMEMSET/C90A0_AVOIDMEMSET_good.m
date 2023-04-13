//
//  C90A0_AVOIDMEMSET_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/04/12.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C90A0_AVOIDMEMSET.h"

@implementation C90A0_AVOIDMEMSET_good : NSObject

void init(char *dest, char *src) {
    size_t len = strlen(src);
    memcpy(dest, src, len);
}

void good(char *password, size_t bufferSize) {
      char localToken[256];
      init(localToken, password);
      memset_s(password, bufferSize, ' ', strlen(password));    //compliant
      memset_s(localToken, sizeof(localToken), ' ', strlen(localToken));    //compliant
      free(password);
    }

@end
