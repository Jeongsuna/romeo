//
//  C9094_PAMVALIDITY__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9094_PAMVALIDITY.h"
#include <security/pam_appl.h>

@implementation C9094_PAMVALIDITY__good : NSObject

-(int) good: pam_handle_t *pam {
    if (pam_authenticate(pamh, PAM_DISALLOW_NULL_AUTHTOK) != PAM_SUCCESS) {
        return -1;
    }
    if (pam_acct_mgmt(pamh, 0) != PAM_SUCCESS) { // Compliant
        return -1;
    }
    return 0;
}

@end
