#include <iostream>

int32_t f(int32_t * p1)
{ 
    // p1은 const로 선언되지 않았으므로 수정 가능(비준수)
    *p1 = 10;
    // i는 const로 선언되지 않았으므로 수정 가능(비준수)
    int32_t i = 0;
    // 함수가 종료될 때 i는 수정 가능하므로 규칙 위반(비준수)
    return i; 
}

int main(void){return 0;}