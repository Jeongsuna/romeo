//
//  C909C_NOCONTROLCHAR__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909C_NOCONTROLCHAR.h"

@implementation C909C_NOCONTROLCHAR__bad : NSObject

-(void)bad{
    const char* barHT = "X  Y"; // Noncompliant
    const char* barBS = "X Y"; // Noncompliant
}

@end
