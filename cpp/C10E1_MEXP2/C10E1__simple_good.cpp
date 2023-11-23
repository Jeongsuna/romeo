#include <iostream>
#include <cstdint>

int main(void) {
    uint8_t u8a = 42; // u8a를 정의하고 초기화
    // u8a를 8만큼 왼쪽으로 시프트하려고 시도합니다.(준수)
    u8a = (uint8_t)(u8a << 8);
    
    // 1u << 10u;

    return 0;
}