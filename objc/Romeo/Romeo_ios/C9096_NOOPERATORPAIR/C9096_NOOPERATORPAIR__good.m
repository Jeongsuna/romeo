//
//  C9096_NOOPERATORPAIR__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9096_NOOPERATORPAIR.h"

@implementation C9096_NOOPERATORPAIR__good : NSObject

-(void)good {
    int foo = -5;
    int bar = 3;
    int* bar2 = 3;

    foo = -bar; // Compliant
    foo -= bar; // Compliant
    foo += bar; // Compliant
    foo != bar; // Compliant
    foo &= bar; // Compliant
    foo *= bar; // Compliant
    foo = &bar2; // Compliant
    foo = *bar2; // Compliant
}

@end
