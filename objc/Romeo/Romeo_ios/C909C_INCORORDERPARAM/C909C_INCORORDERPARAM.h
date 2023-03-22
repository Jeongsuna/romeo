//
//  C909C_INCORORDERPARAM.h
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C909C_INCORORDERPARAM_h
#define C909C_INCORORDERPARAM_h

@interface C909C_INCORORDERPARAM__bad : NSObject

int divide(int foo_start, int foo_end);
-(void) bad;

@end

@interface C909C_INCORORDERPARAM__good : NSObject

int divide(int foo_start, int foo_end);
-(void) good;

@end

#endif /* C909C_INCORORDERPARAM_h */
