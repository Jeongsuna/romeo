#import <Foundation/Foundation.h>

#import "C0015_SENDCLEAR.h"

@implementation C0015_SENDCLEAR : NSObject

-(void) bad {
    NSString * const LOCAL_USER_URL = @"http://localhost:8080/bar/user";
    NSMutableURLRequest *req = [NSMutableURLRequest requestWithURL:[NSURL URLWithString:LOCAL_USER_URL]];
    [[[NSURLSession sharedSession] dataTaskWithRequest: req] resume];
}

-(void) good {
    NSString * const LOCAL_USER_URL = @"https://localhost:8080/bar/user";
    NSMutableURLRequest *req = [NSMutableURLRequest requestWithURL:[NSURL URLWithString:LOCAL_USER_URL]];
    [[[NSURLSession sharedSession] dataTaskWithRequest: req] resume];
}

@end
