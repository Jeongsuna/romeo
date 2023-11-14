#include <iostream>
#include <cstddef>

struct A 
{ 
    int32_t i; 
};

void f1() 
{ 
    // std::offsetof 매크로를 사용합니다.
    std::size_t offset = offsetof(A, i);

}

int main(void){return 0;}