#include <iostream>

int main() {
    int u8a = 0;
    uint8_t u8b = 10;
    uint8_t u8c = 5;

    // increment(++) 및 decrement(--) 연산자룰 다른 연산자와 함께 사용하고 있습니다.
    u8a = ++u8b + u8c--;

    return 0;
}
