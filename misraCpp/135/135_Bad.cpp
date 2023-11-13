#include <iostream>

void foobar ( void ) 
{ 
    int8_t * p1;
    { 
        int8_t local_auto;
        // p1이 local_auto의 주소를 가리킬 때 local_auto는 이미 스코프를 벗어났습니다.(비준수)
        p1 = &local_auto;
    } 
}

int main(void){return 0;}