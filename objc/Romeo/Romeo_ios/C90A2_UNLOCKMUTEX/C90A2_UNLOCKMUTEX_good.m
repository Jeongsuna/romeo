//
//  C90A2_UNLOCKMUTEX_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <pthread.h>

pthread_mutex_t mtx1;
pthread_mutex_t mtx2;

void good1(void)
{
  pthread_mutex_init(&mtx1, NULL);
  pthread_mutex_destroy(&mtx1);
}

void good2(void)
{
  pthread_mutex_init(&mtx1, NULL);
  pthread_mutex_lock(&mtx1);
  pthread_mutex_unlock(&mtx1);
  pthread_mutex_destroy(&mtx1);
}

void good3(void)
{
  pthread_mutex_lock(&mtx1);
  pthread_mutex_lock(&mtx2);
  pthread_mutex_unlock(&mtx2);
  pthread_mutex_unlock(&mtx1);
}
