#include <iostream>
#include <cstddef>

struct A 
{ 
    int32_t i; 
};

void f1() 
{ 
    // 매크로 오프셋은 사용할 수 없습니다.
    offsetof (A, i);
}

int main(void){return 0;}