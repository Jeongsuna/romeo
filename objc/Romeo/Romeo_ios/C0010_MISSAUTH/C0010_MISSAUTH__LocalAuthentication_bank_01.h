//
//  C0010_MISSAUTH__LocalAuthentication_bank_01.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0010_MISSAUTH__LocalAuthentication_bank_01_h
#define C0010_MISSAUTH__LocalAuthentication_bank_01_h
@interface BankAccount : NSObject
-(void) setBalance: (long) balance;
@end
@interface C0010_MISSAUTH__LocalAuthentication_bank_01 : NSObject
-(void) bad: (BankAccount*) account balance:(long) balance;
@end
#endif /* C0010_MISSAUTH__LocalAuthentication_bank_01_h */

