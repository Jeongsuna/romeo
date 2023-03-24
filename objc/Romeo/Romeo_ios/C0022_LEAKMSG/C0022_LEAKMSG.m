#import <Foundation/Foundation.h>

#import "C0022_LEAKMSG.h"

@implementation C0022_LEAKMSG : NSObject

- (void)login_bad:(NSString *)username password:(NSString *)password {
    if (![self authenticateUser:username withPassword:password]) {
        // 인증 실패
        NSString *errorMessage = [NSString stringWithFormat:@"로그인에 실패했습니다. 아이디: %@, 비밀번호: %@", username, password];
        NSLog(@"%@", errorMessage);
    } else {
        // 인증 성공
    }
}
- (void)login_good:(NSString *)username password:(NSString *)password {
    if (![self authenticateUser:username withPassword:password]) {
        // 인증 실패
        NSString *errorMessage = @"로그인에 실패했습니다.";
        NSLog(@"%@", errorMessage);
    } else {
        // 인증 성공
    }
}
- (BOOL)authenticateUser:(NSString *)username withPassword:(NSString *)password {
    // 로그인 인증 로직을 구현합니다.
    return YES; // 인증 성공시 YES를 반환합니다.
}
@end
