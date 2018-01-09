//
//  C0003_XSS__simple_01.h
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 4..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0003_XSS__simple_01_h
#define C0003_XSS__simple_01_h
#import <UIKit/UIKit.h>

@interface C0003_XSS__simple_01 : NSObject

-(void) bad:(UIWebView*) webView arg:(NSString *) arg;

@end
#endif /* C0003_XSS__simple_01_h */
