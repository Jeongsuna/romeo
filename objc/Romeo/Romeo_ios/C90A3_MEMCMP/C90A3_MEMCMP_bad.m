//
//  C90A3_MEMCMP_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>


typedef struct Shape{
  bool visible;
  int x;
  int y;
} Shape;

bool bad(Shape *s1, Shape *s2) {
  return memcmp(s1, s2,  sizeof(Shape)) == 0; // Noncompliant
}


