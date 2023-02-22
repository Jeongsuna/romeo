#import <Foundation/Foundation.h>

#import "C0015_SENDCLEAR.h"

@implementation C0015_SENDCLEAR : NSObject

-(void) bad {
    NSString * const LOCAL_USER_URL = @"http://localhost:8080/igoat/user";
    NSMutableURLRequest *req = [NSMutableURLRequest reqWithURL:[NSURL URLWithString:LOCAL_USER_URL]];
    [[NSURLConnection alloc] initWithRequest:req delegate:self];
}
@end