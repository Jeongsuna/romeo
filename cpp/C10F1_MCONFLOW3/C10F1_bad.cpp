#include <iostream>

void f1() 
{ 
    int32_t j = 0;
    goto L1; 
    for (j = 0; j < 10; ++j) 
    { 
    // L1이 goto 문 이후 동일한 함수 내에서 선언되었습니다.(비준수)
L1:
        j; 
    } 
}

int main(void){return 0;}