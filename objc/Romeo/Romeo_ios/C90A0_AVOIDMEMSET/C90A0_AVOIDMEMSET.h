//
//  
//  Romeo
//
//  Created by Seungcheol on 2023/03/22.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#ifndef C90A0_AVOIDMEMSET_h
#define C90A0_AVOIDMEMSET_h

@interface C90A0_AVOIDMEMSET_bad : NSObject

void init(char * dest, char *src);
void bad(char *password, size_t bufferSize);

@end

@interface C90A0_AVOIDMEMSET_good : NSObject

void init(char *dest, char *src);
void good(char *password, size_t bufferSize);

@end

#endif 
