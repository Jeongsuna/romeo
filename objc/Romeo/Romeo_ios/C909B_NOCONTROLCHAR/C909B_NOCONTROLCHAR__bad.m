//
//  C909B_NOCONTROLCHAR__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909B_NOCONTROLCHAR.h"

@implementation C909B_NOCONTROLCHAR__bad : NSObject

-(void)bad{
    const char* bar = "X    Y";  // Noncompliant
}

@end
