//
//  C90A1_NORETURN_while.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/02.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#include <stdio.h>
#include <Foundation/Foundation.h>


__attribute__((noreturn)) void bad() {
  while (1) {
    // ...
    NSLog(@"infinite loop");
    if (true) {
      
      return ; // Noncompliant
    }
  }
}

__attribute__((noreturn)) void good1() {
  while (1) {
    // ...
    NSLog(@"infinite loop");
      if (true) {
        
       // Concompliant
      }
  }
}

void good2() {  // Concompliant
  while (1) {
    // ...
    NSLog(@"infinite loop");
    if (true) {
      
    
      return;
    }
  }
}


