#include <iostream>

void foobar(void) 
{ 

    int8_t *p1;
    int8_t local_auto;
    //local_auto는 foobar 함수의 스코프 내에서 유효한 범위 내에서 존재합니다.(준수)
    p1 = &local_auto; 
}

int main(void){return 0;}