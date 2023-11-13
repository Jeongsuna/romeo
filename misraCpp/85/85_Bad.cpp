#include <iostream>

struct S 
{ 
    int32_t i; 
    int32_t j; 
};

void f(void *v, int32_t i) 
{ 
    //void 포인터 유형의 객체를 포인터 유형의 객체로 변환하고 있습니다.(비준수)
    S *s1 = reinterpret_cast<S*>(v); 
    S *s2 = reinterpret_cast<S*>(i);
}

int main(void){return 0;}