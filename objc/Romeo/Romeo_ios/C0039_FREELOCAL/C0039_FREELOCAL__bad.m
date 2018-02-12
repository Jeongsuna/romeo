//
//  C0039_FREELOCAL__bad.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 2. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

int bad(int* arg) {
	int *x;
	x = arg;
	if(arg > 0) {
		// Flaw:
		free(x);
	}
	return 0;
}
