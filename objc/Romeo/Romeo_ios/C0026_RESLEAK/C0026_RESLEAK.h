#ifndef C0026_RESLEAK_h
#define C0026_RESLEAK_h
#import <UIKit/UIKit.h>

@interface C0026_RESLEAK : NSObject
-(void)openFile_bad:(NSString *)filePath;
-(void)openFile_good:(NSString *)filePath;
@end

@interface C0026_RESLEAK_bad : UIViewController {
    UIView *myView;
}
@end

@interface C0026_RESLEAK_good : UIViewController {
    UIView *myView;
}
@end
#endif
