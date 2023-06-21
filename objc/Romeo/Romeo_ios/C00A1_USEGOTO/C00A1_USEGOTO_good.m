//
//  C00A1_USEGOTO_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/07.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void good() {
    int a = 0;
    
      if (a <=0) {
        // ...
      }

      if (a == 0) {
      {
        goto L1; // Compliant
      }

    L1:
      for (int i = 0; i < a; i++) {
      L2:
          a++;
      }
    }
    
  }


