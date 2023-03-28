//
//  C00A0_HARDIP__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/27.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C00A0_HARDIP.h"
#include <dbi/dbi.h>

@implementation C00A0_HARDIP__good : NSObject

NSString* getDatabaseHost() {
    NSString *host = @"10.10.0.1"; // NonCompliant
    return host;
}

int main() {
    dbi_conn conn = dbi_conn_new("foo_sql");
    NSString *host = getDatabaseHost(); // Compliant
    dbi_conn_set_option(conn, "host", [host UTF8String]); // Compliant

    dbi_conn_close(conn);
    return 0;
}

@end
