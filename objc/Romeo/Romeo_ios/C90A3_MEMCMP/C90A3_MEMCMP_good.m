//
//  C90A3_MEMCMP_good.m
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

bool isEqual(Shape *s1, Shape *s2) {
    
    return s1->visible == s2->visible && s1->x == s2->x && s1->y == s2->y;
    
    
}


bool good(Shape *s1, Shape *s2)
{
    return isEqual(s1, s2);
}
