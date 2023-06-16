//
//  C10C8_MDECLEDEF13_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/08.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void good (      int * param1, 
             const int * param2,
             const int * param3,
             const int * param4)
{
  *param1 = *param2 + *param3 + *param4;
}

int main (int argc,
          const char * const * argv)
{
  return argc;
}
