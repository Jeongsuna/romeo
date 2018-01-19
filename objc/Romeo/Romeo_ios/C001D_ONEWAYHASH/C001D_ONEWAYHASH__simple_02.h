//
//  C001D_ONEWAYHASH__simple_02.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 18..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C001D_ONEWAYHASH__simple_02_h
#define C001D_ONEWAYHASH__simple_02_h
@interface C001D_ONEWAYHASH__simple_02 : NSObject
-(void)bad: (char *) password passwordLen:(int) passwordLen
derivedKey:(uint8_t *)derivedKey derivedKeyLen:(int) derivedKeyLen;
@end
#endif /* C001D_ONEWAYHASH__simple_02_h */
