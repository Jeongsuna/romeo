//
//  test.m
//  test
//
//  Created by HyoBeom on 2018. 1. 19..
//  Copyright © 2018년 HyoBeom. All rights reserved.
//

#import <Foundation/Foundation.h>
#define BAD_SINK_STRING "Bad Sink..."


int main (int argc, const char *argv[])
{
    
    char filename[100] = "";
    int fileDesc = -1;
    if (fgets(filename, 100, stdin) == NULL)
    {
        NSLog(@"fgets() failed");
        /* Restore NUL terminator if fgets fails */
        filename[0] = '\0';
    }
    if (strlen(filename) > 0)
    {
        filename[strlen(filename)-1] = '\0'; /* remove newline */
    }
    /* FLAW: Open and write to the file after checking the status information */
    if (access(filename, W_OK) == -1)
    {
        exit(1);
    }
    fileDesc  = open(filename, O_RDWR);
    if (fileDesc == -1)
    {
        exit(1);
    }
    if (write(fileDesc, BAD_SINK_STRING, strlen(BAD_SINK_STRING)) == -1)
    {
        exit(1);
    }
    if (fileDesc != -1)
    {
        close(fileDesc);
    }
    
    return 0;
}
