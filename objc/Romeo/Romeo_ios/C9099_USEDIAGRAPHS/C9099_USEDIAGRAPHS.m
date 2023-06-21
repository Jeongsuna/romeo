//
//  C9099	USEDIAGRAPHS.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/09.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>


%:define PI 3.14159265358979323846
%:define SQUARE(x) ((x) * (x))

void bad(int arr<:5:>)
    <% // Noncompliant
        for (int i = 0; i < 5; i++) {
            printf("%d, ", arr<:i:>); // Noncompliant
        }
        printf("\b\b\n");
    %>

#define CIRCLE(radius) (PI * (radius) * (radius))

void good(int arr[5])
{ // Compliant
        for (int i = 0; i < 5; i++) {
            printf("%d, ", arr[i]); // Compliant
        }
        printf("\b\b\n");
}

//
//template <typename T>
//
//class A
//{
//  public:
//    template<int32_t i>
//    void f2();
//};
//
//void bad(A<int32_t> * a<:10:>)    // Noncompliant
//<%                              // Noncompliant
//  a<:0:>->f2<20>();             // Noncompliant
//%>
//
//
//void good(int * a[10])      // Compliant
//{                               // Compliant
//  a[0] = f2<20>();               // Compliant
//}                               // Compliant




