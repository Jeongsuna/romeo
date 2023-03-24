//
//  C909C_NOCONTROLCHAR__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909C_NOCONTROLCHAR.h"

@implementation C909C_NOCONTROLCHAR__good : NSObject

-(void)good{
    const char* barEscapedHT = "X\tY"; // Compliant
    const char* barEscapedLF = "X\bY"; // Compliant
}

@end
