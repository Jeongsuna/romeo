//
//  C00A0_HARDIP__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/27.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C00A0_HARDIP.h"
#include <dbi/dbi.h>

@implementation C00A0_HARDIP__bad : NSObject

-(void)bad{
    dbi_conn conn = dbi_conn_new("foo_sql");
    NSString *host = @"10.10.0.1"; // Noncompliant
    dbi_conn_set_option(conn, "host", [host UTF8String]);
    dbi_conn_set_option(conn, "host", "10.10.0.1"); // Noncompliant
}

@end
