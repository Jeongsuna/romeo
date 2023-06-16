//
//  C9099	USEDIAGRAPHS.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/09.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

template <typename T>

class A
{
  public:
    template<int32_t i>
    void f2();
};

void bad(A<int32_t> * a<:10:>)    // Noncompliant
<%                              // Noncompliant
  a<:0:>->f2<20>();             // Noncompliant
%>


void good(A<int32_t> * a[10])      // Compliant
{                               // Compliant
  a[0]->f2<20>();               // Compliant
}                               // Compliant
