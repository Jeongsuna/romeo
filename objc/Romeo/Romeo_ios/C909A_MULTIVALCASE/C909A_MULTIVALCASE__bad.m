//
//  C909A_MULTIVALCASE__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/27.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909A_MULTIVALCASE.h"

@implementation C909A_MULTIVALCASE__bad :NSObject

-(void)bad{
    int num = 5;
    switch (num) {
      case 0:
        //...
        break;
      case 1 ... 2:
        //...
        break;
      case 3 ... 3: // Noncompliant
        //...
        break;
    }
}

@end
