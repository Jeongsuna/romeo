//
//  C00A1_USEGOTO_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/07.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(int a) {
      if (a == 0) {
        goto L2; // Noncompliant
      }

      if (a == 0) {
      {
        goto L1;
      }
      goto L2; // Noncompliant
    L1:
      for (int i = 0; i < a; i++) {
      L2:
          a++;
      }
    }
    
  }





