//
//  C0008_XPATHI__simple_01.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 1. 16..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Foundation/NSXMLDocument.h>
#import "C0008_XPATHI__simple_01.h"

@implementation C0008_XPATHI__simple_01 : NSObject

-(NSArray*) bad: (NSString*) query xmlfile:(NSString*) xmlfile {
	NSXMLDocument *xmlDoc;
	NSError *err = nil;
	NSURL *furl = [NSURL fileURLWithPath:xmlfile];
	if(furl) {
		xmlDoc = [[NSXMLDocument alloc] initWithContentsOfURL:furl options:(NSXMLNodePreserveWhitespace|NSXMLNodePreserveCDATA) error:&err];
	}
	if(xmlDoc) {
		// Flaw:
		NSArray *result = [xmlDoc nodesForXPath:query error: err];
		return result;
	}
	return nil;
}

@end
