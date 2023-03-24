#ifndef C0022_LEAKMSG_h
#define C0022_LEAKMSG_H

@interface C0022_LEAKMSG : NSObject
- (void)login_bad:(NSString *)username password:(NSString *)password;
- (void)login_good:(NSString *)username password:(NSString *)password;
- (BOOL)authenticateUser:(NSString *)username withPassword:(NSString *)password;
@end
#endif /* C0022_LEAKMSG_H */
