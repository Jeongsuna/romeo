//
//  C10AC_MCHARSLEX2.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/07.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad (int argc, const char * argv[]) {
    
    static const char str[] = "(Date should be in the form ??-??-??)";  //Noncompliant.
    NSLog(@"%s", str);
    
}

void good (int argc, const char * argv[]) {
    
    static const char str[] = "(Date should be in the form ?" "?-?" "?-?" "?)";  // Compliant.
    static const char str2[] = "(Date should be in the form ?-?-?)"; // Compliant.
    static const char str3[] = "(Date should be in the form ? ?-? ?-? ?)"; //   Compliant.
    
    NSLog(@"%s", str);
    NSLog(@"%s", str2);
    NSLog(@"%s", str3);
    
}
