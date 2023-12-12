#include <iostream>

void b(int32_t * const p)
{
    // 이 함수에서 p를 수정할 수 있습니다.
    *p = 20;
}

int32_t f(int32_t * const p2, int32_t * const p3)
{
    // p2는 const로 선언되었으므로 수정 불가능(준수)
    *p2 = 10;
    // p3는 const로 선언되었으므로 수정 불가능(준수)
    b(p3);
    return 0;
}

int main(void){return 0;}