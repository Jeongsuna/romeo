//
//  C0010_MISSAUTH__LocalAuthentication_bank_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <LocalAuthentication/LocalAuthentication.h>
#import "C0010_MISSAUTH__LocalAuthentication_bank_01.h"

@implementation BankAccount : NSObject
-(void) setBalance: (long) balance {
	
}
@end
@implementation C0010_MISSAUTH__LocalAuthentication_bank_01 : NSObject
-(void) bad: (BankAccount*) account balance:(long) balance {
	LAContext *laCtx = [[LAContext alloc] init];
	NSError *error = nil;
	NSString *msg = @"Use Touch ID sensor.";
	
	if([laCtx canEvaluatePolicy:LAPolicyDeviceOwnerAuthenticationWithBiometrics error:&error]) {
		[laCtx evaluatePolicy:LAPolicyDeviceOwnerAuthenticationWithBiometrics localizedReason:msg reply:^(BOOL success, NSError * _Nullable error) {
				if(success) {
					[account setBalance:balance];
				}
			}
		 ];
	}
}
@end
