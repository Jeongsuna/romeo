#include <iostream>

struct S 
{ 
    int32_t i; 
    int32_t j; 
};

void f(void *v, int32_t i) 
{ 
    // 정수형 또는 void 포인터 타입의 객체를
    // 포인터 타입의 객체로 변환해서는 안됩니다.(준수)
}

int main(void){return 0;}