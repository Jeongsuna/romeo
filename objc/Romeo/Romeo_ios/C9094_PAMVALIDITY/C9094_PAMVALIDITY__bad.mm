//
//  C9094_PAMVALIDITY__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9094_PAMVALIDITY.h"
#include <security/pam_appl.h>

@implementation C9094_PAMVALIDITY__bad :NSObject

-(int) bad_01: (pam_handle_t *)pamh {
    if (pam_authenticate(pamh, PAM_DISALLOW_NULL_AUTHTOK) != PAM_SUCCESS) { // Noncompliant
        return -1;
    }

    return 0;
}

-(int) bad_02: (pam_handle_t *)pamh {
    if (pam_authenticate(pamh, PAM_DISALLOW_NULL_AUTHTOK) != PAM_SUCCESS) {
        return -1;
    }
    pam_acct_mgmt(pamh, 0); // Noncompliant
    return 0;
}

@end
