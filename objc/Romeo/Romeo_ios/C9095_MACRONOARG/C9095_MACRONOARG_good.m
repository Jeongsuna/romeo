//
//  C9095_MACRONOARG_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/15.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

#define PRINT_PI(pi) NSLog(@"PI Value is %f", pi) //Compliant

int main(int argc, const char* argv[]) {
    @autoreleasepool {
        
        PRINT_PI(M_PI); //Compliant
        
    }
    return 0;
}
