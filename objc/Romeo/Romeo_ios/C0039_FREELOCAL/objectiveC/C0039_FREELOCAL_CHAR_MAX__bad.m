//
//  C0016_HARDPASS_bad.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C0039_FREELOCAL.h"

@implementation C0039_FREELOCAL_bad : NSObject

-(void) bad:(NSString *) example{
    
    //flaw:
    free(CHAR_MAX);
}

@end
