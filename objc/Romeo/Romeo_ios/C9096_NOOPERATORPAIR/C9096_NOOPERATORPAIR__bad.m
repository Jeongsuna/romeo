//
//  C9096_NOOPERATORPAIR__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C9096_NOOPERATORPAIR.h"

@implementation C9096_NOOPERATORPAIR__bad : NSObject

-(void) bad{
    int foo = -5;
    int bar = 3;
    int* bar2 = 3;

    foo =- bar;  // Noncompliant
    foo =+ bar; // Noncompliant
    foo =! bar; // Noncompliant
    foo =& bar; // Noncompliant
    foo =& bar2; // Noncompliant
    foo =* bar2; // Noncompliant
    foo +=+ bar; // Noncompliant
    foo -=- bar; // Noncompliant
    foo = - bar;  // Noncompliant
}

@end
