//
//  C909A_MULTIVALCASE_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/27.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909A_MULTIVALCASE.h"

@implementation C909A_MULTIVALCASE__good:NSObject

-(void)good_01{
    int num = 5;
    switch (num) {
      case 0:
        //...
        break;
      case 1 ... 2:
        //...
        break;
      case 3:
        //...
        break;
    }
}

-(void)good_02{
    int num = 5;
    switch (num) {
      case 0:
        //...
        break;
      case 1 ... 2:
        //...
        break;
      case 3 ... 5:
        //...
        break;
    }
}

@end
