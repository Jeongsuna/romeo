#include <iostream>
#include <cstdint>

int main() {
    int32_t i;
    int32_t j;
    int32_t k;

    // Non-compliant: i에 1234를 할당하지 않고 i의 타입 크기, 즉 4 (int32_t의 크기)를 j에 할당하게 됩니다..(비준수)
    j = sizeof(i = 1234);

    // Non-compliant: i를 증가시키지 않고 i의 타입 크기, 즉 4 (int32_t의 크기)를 k에 할당하게 됩니다..(비준수)
    k = sizeof(i++ + j);

    return 0;
}