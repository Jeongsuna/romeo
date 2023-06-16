//
//  C9099	USEDIAGRAPHS.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/09.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface A<T> : NSObject
- (void)f2:(int32_t)i;
@end

@implementation A
- (void)f2:(int32_t)i {
    // 해당 메서드를 구현하세요.
}
@end

void f(A<NSNumber *> *a<:10:>)    /* Noncompliant - usage of '<:' instead of '[' and ':>' instead of ']' */
<%                              /* Noncompliant - usage of '<%' instead of '{' */
  *a<:0:> = 1;             /* Noncompliant - usage of '<:' and ':>' */
%>
