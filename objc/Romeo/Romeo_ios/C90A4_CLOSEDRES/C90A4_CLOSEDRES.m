//
//  C90A4_CLOSEDRES.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(NSString *fileName, BOOL condition) {
    
    FILE *pFile;
    pFile = fopen([fileName UTF8String], "w");

    if (condition) {
        fclose(pFile);
        // ...
    }

    fclose(pFile); // Noncompliant
}


void good(NSString *fileName, BOOL condition) {
    
    FILE *pFile;
    pFile = fopen([fileName UTF8String], "w");

    if (condition) {
                    // Compliant
        // ...
    }

    fclose(pFile);
}

