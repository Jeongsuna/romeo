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
        
        /* FLAW: Set data to a hardcoded string */
        _server = @"localhost";
        _username = @"username";
        _password = @"password";
        _database = @"database";
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
