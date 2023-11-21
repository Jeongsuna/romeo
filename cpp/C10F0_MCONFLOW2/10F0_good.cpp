#include <iostream>

void f()
{
    int32_t j = 0;
L1:
    ++j;
    if (10 == j)
    {
        // 나중에 선언된 레이블 L2로 이동하고 있습니다(준수)
        goto L2;
    }
L2:
    ++j;
}

int main(void){return 0;}