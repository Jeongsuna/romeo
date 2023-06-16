//
//  C0066_SIZEOFPTR_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/09.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(int *data, int array[10]) {
    
  size_t const dataSize = sizeof data / sizeof(int); // Noncompliant
  size_t const arraySize = sizeof array / sizeof(int); // Noncompliant
  int primes[] = { 1, 2, 3, 5, 7, 13, 17, 19};
  size_t const primesSize = sizeof primes / sizeof(int); // Compliant
  size_t const primesSize2 = sizeof(primes + 1) / sizeof(int); // Noncompliant
    
}
