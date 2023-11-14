#include <iostream>

// 재귀함수 사용을 지향하고 반복 루프를 사용하여 로직을 작성합니다.(준수)
int32_t fn(int32_t x) {
    int32_t result = 1;
    while (x > 0) {
        result *= x;
        x--;
    }
    return result;
}

int main(void){return 0;}