#import <Foundation/Foundation.h>

int main (int argc, const char * argv[])
{
    NSString *str = @"Hello, World!";
    //flaw:
    NSLog("%s", str);
    
    return 0;

}
