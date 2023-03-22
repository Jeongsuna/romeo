//
//  C10BA_MLITERCONST3__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#include "C10BA_MLITERCONST3.h"

@implementation C10BA_MLITERCONST3__good : NSObject

-(void) good{
    const int64_t   bar01 = 0L;
    const uint64_t  bar02 = 0LU;
    const uint64_t  bar03 = 0ULL;
}

@end
