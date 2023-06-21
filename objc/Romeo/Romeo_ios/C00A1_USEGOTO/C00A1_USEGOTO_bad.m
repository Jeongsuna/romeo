//
//  C00A1_USEGOTO_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/07.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int bad() {
    int j = 0;
  L1:
    ++j;
    if (10 == j) {
      goto L2;
    }
    goto L1;           // Noncompliant
  L2:
    return ++j;
}

int main() {
    @autoreleasepool {
        NSLog(@"Result: %d", bad());
        return 0;
    }
}




