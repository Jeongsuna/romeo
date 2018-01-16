//
//  ViewController.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 2..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import "ViewController.h"


@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}
- (IBAction)fire:(id)sender url:(NSURL*) url {
    NSString * textBoxStr = [_textBox text];
    C0001_CWE89_SQL_Injection__simple_01* c0001 = [[C0001_CWE89_SQL_Injection__simple_01 alloc] init];
    C0002_PATHMANIP__simple_01* c0002 = [[C0002_PATHMANIP__simple_01 alloc] init];
    C0003_XSS__simple_01 *c0003 = [[C0003_XSS__simple_01 alloc] init];
	C000F_FORMATI__NSLog_01 *c000F_01 = [[C000F_FORMATI__NSLog_01 alloc] init];
	C000F_FORMATI__stringWithFormat_01 *c000F_02 = [[C000F_FORMATI__stringWithFormat_01 alloc] init] ;
	C000F_FORMATI__stringByAppendingFormat_01 *c000F_03
		= [[C000F_FORMATI__stringByAppendingFormat_01 alloc] init];
	C000F_FORMATI__initWithFormat_01 *c000F_04
		= [[C000F_FORMATI__initWithFormat_01 alloc] init];
	C000F_FORMATI__appendFormat_01 *c000F_05
		= [[C000F_FORMATI__appendFormat_01 alloc] init];
    sqlite3* sqlite = NULL;
    [c0001 bad:sqlite atId:textBoxStr];
    [c0002 bad: textBoxStr];
    [c0003 bad: _webView arg: textBoxStr];
	[c000F_01 bad: textBoxStr additional: @"arg2"];
	[c000F_02 bad: textBoxStr additional: @"arg2"];
	[c000F_03 bad: textBoxStr additional: @"arg2"];
	[c000F_04 bad: textBoxStr additional: @"arg2"];
	[c000F_05 bad: textBoxStr additional: @"arg2"];
	
//	UIApplication* xxx = [[UIApplication alloc] init];
//	[xxx openURL:url];
}


@end
