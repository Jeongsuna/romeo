#import <Foundation/Foundation.h>

#import "C0014_STORECLEAR.h"

@implementation C0014_STORECLEAR : NSObject

-(void) bad_kSecAttrAccessibleWhenUnlocked {
    NSMutableDictionary *boo = [NSMutableDictionary dictionary];
    NSData *bar = [@"secret" dataUsingEncoding:NSUTF8StringEncoding];

    [boo setObject:(__bridge KeyId)kSecClassGenericPassword forKey:(__bridge KeyId) kSecClass];
    [boo setObject:bar forKey:(__bridge KeyId)kSecValueData];
    [boo setObject:(__bridge KeyId)kSecAttrAccessibleWhenUnlocked forKey:(__bridge KeyId) kSecAttrAccessible];

    OSStatus status_err = SecItemAdd((__bridge CFDictionaryRef)boo, NULL);
}
-(void) bad_kSecAttrAccessibleAfterFirstUnlock {
    NSMutableDictionary *boo = [NSMutableDictionary dictionary];
    NSData *bar = [@"secret" dataUsingEncoding:NSUTF8StringEncoding];

    [boo setObject:(__bridge KeyId)kSecClassGenericPassword forKey:(__bridge KeyId) kSecClass];
    [boo setObject:bar forKey:(__bridge KeyId)kSecValueData];
    [boo setObject:(__bridge KeyId)kSecAttrAccessibleAfterFirstUnlock forKey:(__bridge KeyId) kSecAttrAccessible];

    OSStatus status_err = SecItemAdd((__bridge CFDictionaryRef)boo, NULL);
}
-(void) bad_kSecAttrAccessibleAlways {
    NSMutableDictionary *boo = [NSMutableDictionary dictionary];
    NSData *bar = [@"secret" dataUsingEncoding:NSUTF8StringEncoding];

    [boo setObject:(__bridge KeyId)kSecClassGenericPassword forKey:(__bridge KeyId) kSecClass];
    [boo setObject:bar forKey:(__bridge KeyId)kSecValueData];
    [boo setObject:(__bridge KeyId)kSecAttrAccessibleAlways forKey:(__bridge KeyId) kSecAttrAccessible];

    OSStatus status_err = SecItemAdd((__bridge CFDictionaryRef)boo, NULL);
}
-(void) bad_kSecAttrAccessibleWhenUnlockedThisDeviceOnly {
    NSMutableDictionary *boo = [NSMutableDictionary dictionary];
    NSData *bar = [@"secret" dataUsingEncoding:NSUTF8StringEncoding];

    [boo setObject:(__bridge KeyId)kSecClassGenericPassword forKey:(__bridge KeyId) kSecClass];
    [boo setObject:bar forKey:(__bridge KeyId)kSecValueData];
    [boo setObject:(__bridge KeyId)kSecAttrAccessibleWhenUnlockedThisDeviceOnly forKey:(__bridge KeyId) kSecAttrAccessible];

    OSStatus status_err = SecItemAdd((__bridge CFDictionaryRef)boo, NULL);
}
@end