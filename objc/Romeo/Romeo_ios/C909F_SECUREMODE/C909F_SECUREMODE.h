//
//
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C909F_SECUREMODE_h
#define C909F_SECUREMODE_h



@interface C909F_SECUREMODE__bad : NSObject

-(void) bad_botan;
-(void) bad_crypto;
-(void) bad_openssl;

@end

@interface C909F_SECUREMODE__good : NSObject

-(void) good_botan;
-(void) good_crypto;
-(void) good_openssl;

@end

#endif 
