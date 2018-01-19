//
//  C0016_HARDPASS.h
//  Romeo
//
//  Created by HyoBeom on 2018. 1. 17..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#ifndef C0016_HARDPASS_h
#define C0016_HARDPASS_h

@import Foundation.NSObject;
@import Foundation.NSString;

NS_ASSUME_NONNULL_BEGIN

@interface SQLSettings : NSObject

/*
 *  Returns a SQLSettings instance
 *
 *  @return SLQSettings object
 */
+ (instancetype)settings;

/*
 *  Returns a shared SQLSettings instance. This object can be used to specify default settings that SQLConnection objects will use when initialized without settings parameters.
 *
 *  @return Default settings object
 */
+ (instancetype)defaultSettings;

/**
 *  The database server to use.  Supports server, server:port, or server\instance (be sure to escape the backslash)
 */
@property (nonatomic,strong) NSString *server;

/**
 *  The database username
 */
@property (nonatomic,strong) NSString *username;

/**
 *  The database password
 */
@property (nonatomic,strong) NSString *password;

/**
 *  The database name to use
 */
@property (nonatomic,strong) NSString *database;

@end

NS_ASSUME_NONNULL_END

#endif /* C0016_HARDPASS_h */
