#include <iostream>

struct S 
{ 
    int32_t i; 
    int32_t j; 
};

void f(void *v, int32_t i) 
{ 
    // Non-compliant: void 포인터 타입 객체를 객체 포인터 타입의 객체로 변환하고 있습니다.
    S *s1 = reinterpret_cast<S*>(v);
    // Non-compliant: 정수형 타입 객체를 객체 포인터 타입의 객체로 변환하고 있습니다.
    S *s2 = reinterpret_cast<S*>(i);
}

int main(void){return 0;}