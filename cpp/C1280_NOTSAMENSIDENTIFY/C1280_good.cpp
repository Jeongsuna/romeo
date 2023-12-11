#include <iostream>
#include <stdint.h>

// 방법 1. using 선언을 한번만 사용합니다.
namespace NS_Good {
    void f_good(uint16_t); 
    void f_good(uint32_t); 
}
// 한 번만 using-declaration 사용
using NS_Good::f_good;

int main(void){

    f_good( 0U );

    return 0;
}
