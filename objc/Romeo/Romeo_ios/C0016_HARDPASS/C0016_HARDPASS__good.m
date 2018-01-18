//
//  C0019_HARDPASS__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 15..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "C0016_HARDPASS.h"


@implementation SQLSettings

- (instancetype)init {
    self = [super init];
    if (self) {
        
        NSString *string =
        [NSString stringWithContentsOfFile:
         [[NSBundle mainBundle]pathForResource:@"file" ofType:@"txt"]];
        
        NSArray *array = [string componentsSeparatedByCharactersInSet:[NSCharacterSet newlineCharacterSet]];
        
        /* FIX: Read data from the console using readLine() */
        _server = [NSString stringWithFormat: @"%@", [array objectAtIndex:0]];
        _username = [NSString stringWithFormat: @"%@", [array objectAtIndex:1] ];
        _password = [NSString stringWithFormat: @"%@", [array objectAtIndex:2] ];
        _database = [NSString stringWithFormat: @"%@", [array objectAtIndex:3] ];
    }
    return self;
}

+ (instancetype)settings {
    return [[self alloc] init];
}

+ (instancetype)defaultSettings {
    static SQLSettings *defaultSettings;
    @synchronized(self) {
        if (!defaultSettings) {
            defaultSettings = [SQLSettings settings];
        }
        return defaultSettings;
    }
}

@end
