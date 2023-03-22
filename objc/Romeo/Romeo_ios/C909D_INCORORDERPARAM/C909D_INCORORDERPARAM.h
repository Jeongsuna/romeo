//
//  C909D_INCORORDERPARAM.h
//  Romeo
//
//  Created by Seungcheol on 2023/03/21.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C909D_INCORORDERPARAM_h
#define C909D_INCORORDERPARAM_h

@interface C909D_INCORORDERPARAM__bad : NSObject

int divide(int foo_start, int foo_end);
-(void) bad;

@end

@interface C909D_INCORORDERPARAM__good : NSObject

int divide(int foo_start, int foo_end);
-(void) good;

@end

#endif /* C909D_INCORORDERPARAM_h */
