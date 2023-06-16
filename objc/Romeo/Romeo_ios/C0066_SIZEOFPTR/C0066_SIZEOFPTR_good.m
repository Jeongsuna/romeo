//
//  C0066_SIZEOFPTR_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/09.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void good(int *data, int dataSize, int (&array)[10]) {
    size_t const arraySize = sizeof array / sizeof(int);    //Compliant
    int primes[] = { 1, 2, 3, 5, 7, 13, 17, 19 };
    size_t const primesSize = sizeof(primes) / sizeof(int);
    size_t const primesSize2 = sizeof(primes) / sizeof(int) + 1;
}
