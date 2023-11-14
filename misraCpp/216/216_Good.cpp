#include <iostream>

// 표준 라이브러리 함수의 이름을 재정의 하지 않습니다.
// 해당 기능이 필요하다면 중복되지 않은 명확한 함수명을 사용합니다.
int32_t getMax(int32_t a, int32_t b)
{
    return ((a > b) ? a : b);
}

int main(void){return 0;}