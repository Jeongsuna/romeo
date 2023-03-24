//
//  C909B_APPROSTREAM__good.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/23.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909B_APPROSTREAM.h"

@implementation C909B_APPROSTREAM__good : NSObject

-(void)good{
    FILE *bar1 = fopen("fileName", "r");
    if (bar1) {
      fseek(bar1, 1, SEEK_SET);
      fclose(bar1);
    }

    FILE *bar2 = tmpfile();
    if (bar2) {
      ftell(bar2);
      fseek(bar2, 1, SEEK_END);
      fclose(bar2);
    }
}

@end
