//
//  C90A7_CHANGEDIR.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <unistd.h>
#import <fcntl.h>

void bad() {
    NSString *anyDir = @"/any/";
    const char *anyDirPath = [anyDir UTF8String];

    chdir(anyDirPath);

    int fd = open(anyDirPath, O_RDONLY | O_DIRECTORY);
    fchdir(fd); //Sensitive

}

void good() {
    
    const char* root_dir = "/jail/";
    
    if (chdir(root_dir) == -1) {
    exit(-1);
    } // Compliant

    int fd = open(root_dir, O_RDONLY | O_DIRECTORY);
    if(fchdir(fd) == -1) {
    exit(-1);
    } // Compliant{
    
}
