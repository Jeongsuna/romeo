//
//  C9097_PUBLICWRITABLEDIR__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9097_PUBLICWRITABLEDIR.h"

#include <cstdio>
#include <cstdlib>
#include <sstream>

@implementation C9097_PUBLICWRITABLEDIR__bad : NSObject

-(void) bad_01{
    FILE * fp = fopen("/tmp/temporary_file", "r"); // Noncompliant
}

-(void) bad_02{
    std::stringstream ss;
    ss << getenv("TMPDIR") << "/temporary_file"; // Noncompliant
    FILE * fp = fopen(ss.str().c_str(), "w");
}

@end
