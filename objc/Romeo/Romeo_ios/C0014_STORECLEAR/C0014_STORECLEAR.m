#import <Foundation/Foundation.h>

#import "C0014_STORECLEAR.h"

@implementation C0014_STORECLEAR : NSObject

-(void) bad {
    // 암호화되지 않은 형태로 민감한 정보를 저장하는 나쁜 예제입니다.
    NSString *username = @"username";
    NSString *password = @"password";

    // UserDefaults에 민감한 정보를 저장합니다.
    NSUserDefaults *defaults = [NSUserDefaults standardUserDefaults];
    [defaults setObject:username forKey:@"Username"];
    [defaults setObject:password forKey:@"Password"];
    [defaults synchronize];

    // 나중에 정보를 사용할 때 민감한 정보를 복원합니다.
    NSString *storedUsername = [defaults objectForKey:@"Username"];
    NSString *storedPassword = [defaults objectForKey:@"Password"];
}
-(void) good {
    // 암호화되지 않은 형태로 민감한 정보를 저장하는 좋은 예제입니다.
    NSString *username = @"username";
    NSString *password = @"password";

    // Keychain에 민감한 정보를 저장합니다.
    NSError *error = nil;
    [SSKeychain setPassword:password forService:@"com.example.app" account:username error:&error];
    if (error) {
        NSLog(@"Error saving to Keychain: %@", error);
    }

    // 나중에 정보를 사용할 때 Keychain에서 민감한 정보를 복원합니다.
    NSString *storedPassword = [SSKeychain passwordForService:@"com.example.app" account:username error:&error];
    if (error) {
        NSLog(@"Error retrieving from Keychain: %@", error);
    }
}
@end