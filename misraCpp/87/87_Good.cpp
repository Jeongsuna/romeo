#include <iostream>

int main() {
    uint8_t u8a = 0;
    uint8_t u8b = 10;
    uint8_t u8c = 5;

    //increment(++) 및 decrement(--) 연산자와 다른 연산자를 분리하여 사용합니다.(준수)
    ++u8b; 
    u8a = u8b + u8c; 
    u8c--;

    return 0;
}