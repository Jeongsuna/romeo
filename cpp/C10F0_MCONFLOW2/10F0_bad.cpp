#include <iostream>

void f()
{
    int32_t j = 0;
L1:
    ++j;
    if (10 == j)
    {
        
    }
    // goto 문은 동일한 함수 본문에서 나중에 선언된 레이블로 이동해야 합니다.(비준수)
    goto L1;
L2:
    ++j;
}

int main(void){return 0;}