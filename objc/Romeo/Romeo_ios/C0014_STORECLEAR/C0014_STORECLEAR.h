#ifndef C0014_STORECLEAR_h
#define C0014_STORECLEAR_h

@interface C0014_STORECLEAR : NSObject
-(void) bad_kSecAttrAccessibleWhenUnlocked;
-(void) bad_kSecAttrAccessibleAfterFirstUnlock;
-(void) bad_kSecAttrAccessibleAlways;
-(void) bad_kSecAttrAccessibleWhenUnlockedThisDeviceOnly;
@end
#endif /* C0014_STORECLEAR_h */