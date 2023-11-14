#include <iostream>
// 방법 1. using 선언을 한번만 사용합니다.
namespace NS1 {
    void f(uint16_t); 
    void f(uint32_t); 
}
// 한 번만 using-declaration 사용
using NS1::f;
void bar() {
    f(0U); 
}




