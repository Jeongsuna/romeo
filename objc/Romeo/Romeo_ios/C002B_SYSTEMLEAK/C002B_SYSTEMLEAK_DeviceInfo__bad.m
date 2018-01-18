//
//  C0019_HARDPASS__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

int main(int argc, const char * argv[]) {

     NSString* deviceID = [[UIDevice currentDevice] name];
    
     /* FLAW: exposure of system data to an unauthorized control sphere */
     [deviceID writeToFile:@"/dev/stderr" atomically:NO encoding:NSUTF8StringEncoding error:nil];

    return 0;
}
