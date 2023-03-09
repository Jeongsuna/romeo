#import <Foundation/Foundation.h>
#import "C0026_RESLEAK.h"

@implementation C0026_RESLEAK : NSObject

- (void)openFile_bad:(NSString *)filePath {
    NSFileHandle *file = [NSFileHandle fileHandleForReadingAtPath:filePath];
    // 파일을 읽는 도중 에러가 발생할 경우 처리하지 않음
    NSData *data = [file readDataToEndOfFile];
    // 파일을 읽은 후 파일 핸들을 해제하지 않음
}

- (void)openFile_good:(NSString *)filePath {
    NSFileHandle *file = [NSFileHandle fileHandleForReadingAtPath:filePath];
    if (file) {
        @try {
            NSData *data = [file readDataToEndOfFile];
            // 데이터 처리
        }
        @catch (NSException *exception) {
            // 예외 처리
            NSLog(@"Exception occurred: %@", exception);
        }
        @finally {
            [file closeFile];
        }
    } else {
        NSLog(@"Failed to get file handle");
    }
}
@end

