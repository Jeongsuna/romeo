//
//  ViewController.m
//  Romeo_macos
//
//  Created by Jemin Kim on 2018. 1. 4..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import "ViewController.h"

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
	
    // Do any additional setup after loading the view.
}


- (void)setRepresentedObject:(id)representedObject {
    [super setRepresentedObject:representedObject];

    // Update the view, if already loaded.
}
- (IBAction)fire:(id)sender {
	NSString *textBoxContents = [_textField stringValue];
	C0004_CMDI__simple_01* c0004 = [[C0004_CMDI__simple_01 alloc] init];
	C0007_XQUERYI__simple_01* c0007 = [[C0007_XQUERYI__simple_01 alloc] init];
	C0008_XPATHI__simple_01 *c0008 = [[C0008_XPATHI__simple_01 alloc] init];
	[c0004 bad:textBoxContents];
	[c0007 bad:textBoxContents xmlfile:@"sample.xml"];
	[c0008 bad:textBoxContents xmlfile:@"sample.xml"];
}


@end
