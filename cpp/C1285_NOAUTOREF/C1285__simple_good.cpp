#include <iostream>

// 함수는 함수 내에 정의된 자동 변수(매개 변수 포함)에 대한 참조 또는 포인터를 반환하지 않아야 합니다.(준수)
int32_t * fn5 ( void ) 
{ 
    static int32_t x = 0;
    // 정적 변수 x의 주소를 반환하고 있습니다.(준수)
    return &x;
}

int main(void){return 0;}