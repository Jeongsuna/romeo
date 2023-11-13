#include <iostream>
#include <cmath>
#include <limits>

int main() {
    float x, y;
    // fabs 함수를 사용하여 x와 y 사이의 차이를 계산하고 
    // 이 차이를 부동 소수점의 정밀도에 따라 비교합니다.(준수)
    if (fabs(x - y) <= std::numeric_limits<float>::epsilon())

    return 0;
}