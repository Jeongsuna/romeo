#import <Foundation/Foundation.h>
#import "C0026_RESLEAK.h"

@implementation C0026_RESLEAK_bad

- (void)viewDidLoad {
    [super viewDidLoad];

    myView = [[UIView alloc] initWithFrame:CGRectZero];
    [self.view addSubview:myView];
}

- (void)viewDidDisappear:(BOOL)animated {
    [super viewDidDisappear:animated];

    [myView removeFromSuperview];
}

@end

