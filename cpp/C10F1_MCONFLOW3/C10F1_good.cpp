#include <iostream>
void f1(){}


void f2() 
{ 
    for (int32_t j = 0; j < 10; ++j) 
    { 
        for (int32_t i = 0; i < 10; ++i) 
        { 
            goto L1; 
        } 
    } 
// L1이 goto 문을 포함하는 외부 블록에서 선언되었습니다(준수)
L1: 
    f1(); 
}

int main(void){return 0;}