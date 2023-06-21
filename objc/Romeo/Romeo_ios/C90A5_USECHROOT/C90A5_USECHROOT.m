//
//  C90A5_USECHROOT.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <unistd.h>

void bad() {
    
   const char *root_dir = "/jail/";
   chroot(root_dir); // Noncompliant
        
   const char *any_dir = "/any/";
   chdir(any_dir); // Noncompliant

}

void good() {
    
    const char* root_dir = "/jail/";

    if (chdir(root_dir) == -1) {  // Compliant
      exit(-1);
    }

    if (chroot(root_dir) == -1) {  // Compliant
      exit(-1);
    }

}




