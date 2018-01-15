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
- (IBAction)fire:(id)sender {
    NSString * textBoxStr = [_textBox text];
    C0001_CWE89_SQL_Injection__simple_01* c0001 = [[C0001_CWE89_SQL_Injection__simple_01 alloc] init];
    C0002_PATHMANIP__simple_01* c0002 = [[C0002_PATHMANIP__simple_01 alloc] init];
    C0003_XSS__simple_01 *c0003 = [[C0003_XSS__simple_01 alloc] init];
    sqlite3* sqlite = NULL;
    [c0001 bad:sqlite atId:textBoxStr];
    [c0002 bad: textBoxStr];
    [c0003 bad: _webView arg: textBoxStr];
}


@end
