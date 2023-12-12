#include <iostream>

// 함수는 참조 또는 const 참조에 의해 전달되는 매개 변수에 대한 참조 또는 포인터를 반환하지 않아야 합니다.(준수)
int32_t fn6(const int32_t x) {
    return x;
}

int main(void){return 0;}