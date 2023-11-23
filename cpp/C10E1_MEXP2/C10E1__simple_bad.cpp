#include <iostream>
#include <stdint.h>

int main(void) {
    int8_t u8a = 42; // u8a를 정의하고 초기화
    // u8a를 9만큼 왼쪽으로 시프트하려고 시도합니다.(비준수)
    u8a = (int8_t)(u8a << 9);
    // 1은 uint의 비트 너비인 32보다 작으므로 문제가 없습니다.(비준수)
    1u << 10u;

    return 0;
}