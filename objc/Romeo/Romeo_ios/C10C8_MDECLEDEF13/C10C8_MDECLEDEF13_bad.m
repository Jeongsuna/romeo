//
//  C10C8_MDECLEDEF13_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/08.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

void bad(int *param1,  
               const int *param2,
               int *param3, // Noncompliant
               int *param4) // Noncompliant
{
    *param1 = *param2 + *param3 + *param4;
}

int main (int argc,
          const char * * argv) // Noncompliant
{
  return argc;
}

