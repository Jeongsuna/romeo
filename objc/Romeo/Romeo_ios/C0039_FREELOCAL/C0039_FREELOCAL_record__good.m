//
//  C0039_FREELOCAL_record__good.m
//  Romeo
//
//  Created by Jemin Kim on 2018. 2. 12..
//  Copyright © 2018년 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>

struct record {
	int name;
	int year;
};

int good() {
	struct record bar[100];
	for(int i=0; i < 100; i++) {
		bar[i].name = 10;
		bar[i].year = 2018;
	}
	
	free(bar);
	return 0;
}
