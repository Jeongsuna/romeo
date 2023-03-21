//
//  C10BA_MLITERCONST3__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#include "C10BA_MLITERCONST3.h"

@implementation C10BA_MLITERCONST3__bad : NSObject

-(void) bad{
    const int64_t   bar01 = 0l;
    const uint64_t  bar02 = 0lU;
    const uint64_t  bar03 = 0Ull;
    const __int128  bar04 = 0ll;
}

@end

