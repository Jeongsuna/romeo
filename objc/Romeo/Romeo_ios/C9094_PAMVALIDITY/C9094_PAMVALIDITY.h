//
//  C9094_PAMVALIDITY.h
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C9094_PAMVALIDITY_h
#define C9094_PAMVALIDITY_h

@interface C9094_PAMVALIDITY__bad : NSObject

-(int) bad_01: (pam_handle_t *)pam;
-(int) bad_02: (pam_handle_t *)pam;

@end

@interface C9094_PAMVALIDITY__good : NSObject

-(int) good: (pam_handle_t *)pam;

@end

#endif /* C9094_PAMVALIDITY_h */
