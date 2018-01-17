//
//  C0016_HARDPASS_bad.m
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "C001C_LEAKCOM.h"

@implementation C001C_LEAKCOM_bad : NSObject

-(void) bad:(NSString *) example{
    
    //flaw : using Hard-coded Password
    // id : 123121212
    // 비번 : 10dadf1!23
    
}

@end
