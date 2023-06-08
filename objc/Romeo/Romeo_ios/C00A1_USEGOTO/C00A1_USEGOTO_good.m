//
//  C00A1_USEGOTO_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/07.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int good() {
    int j;
    for (j = 0; j < 11; j++) {
        // ...
    }
    return ++j;
}

int main() {
    @autoreleasepool {
        NSLog(@"Result: %d", good());
        return 0;
    }
}
