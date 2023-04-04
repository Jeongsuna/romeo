//
//  C909B_APPROSTREAM__bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/03/23.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C909B_APPROSTREAM.h"

@implementation C909B_APPROSTREAM__bad : NSObject

-(void)bad{
    FILE *bar1 = fopen("fileName", "r");
    fseek(bar1, 1, SEEK_SET); // Noncompliant
    fclose(bar1);

    FILE *bar2 = tmpfile();
    ftell(bar2); // Noncompliant
    if (bar2) {
      fseek(bar2, 1, 3); // Noncompliant
    }
    fclose(bar2);
}

@end
