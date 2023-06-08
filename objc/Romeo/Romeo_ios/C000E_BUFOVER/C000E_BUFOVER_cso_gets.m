//
//  C000E_BUFOVER_cso_gets.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/02.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <stdio.h>


int bad(int argc, const char * argv[]) {
    @autoreleasepool {
        char buffer[50];

        printf("Enter your string: ");
        gets(buffer); // 버퍼 오버플로우 발생 가능성이 있는 위치

        NSLog(@"Your string: %s", buffer);
    }
    return 0;
}



int good(int argc, const char * argv[]) {
    
        char buffer[50];

        printf("Enter your string: ");
        fgets(buffer, sizeof(buffer), stdin); // 버퍼 오버플로우 방지

        buffer[strcspn(buffer, "\n")] = 0;
        
        NSLog(@"Your string: %s", buffer);
    
    return 0;
}

int good2(int argc, const char * argv[]) {
    
        char buffer[50];

        printf("Enter your string: ");
  //      gets_s(buffer, sizeof(buffer), stdin); // 버퍼 오버플로우 방지 C11이상에서 사용 가능

        buffer[strcspn(buffer, "\n")] = 0;
        
        NSLog(@"Your string: %s", buffer);
    
    return 0;
}
