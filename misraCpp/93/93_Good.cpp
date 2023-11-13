#include <iostream>
#include <cstdint>

int main() {
    int32_t i;
    int32_t j;
    volatile int32_t k;
    
    // k의 크기를 계산하고 그 값을 변수 j에 할당합니다(준수)
    j = sizeof(k);
    
    return 0;
}