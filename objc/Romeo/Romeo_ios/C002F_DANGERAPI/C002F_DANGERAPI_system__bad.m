//
//  test.m
//  test
//
//  Created by HyoBeom on 2018. 1. 19..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>



int main (int argc, const char * argv[])
{
   char command[100];
   printf("Enter the command you want to execute: ");
   scanf("%s", command);
   // flaw:
   system(command);

   return 0;

}
