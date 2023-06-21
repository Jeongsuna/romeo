//
//  C0020_TOCTOU_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/19.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#include <stdio.h>
#include <errno.h>
#include <unistd.h>

void bad(const char *file) {
  if (access(file, F_OK) == -1 && errno == ENOENT) {

    FILE *f = fopen(file, "w"); // Noncompliant
    if (NULL == f) {
      
    }

    if (fclose(f) == EOF) {
      
    }
  }
}

void good(const char *file) {
  FILE *f = fopen(file, "wx"); // Compliant
  if (NULL == f) {
    
  }
  
  if (fclose(f) == EOF) {
    
  }
}
