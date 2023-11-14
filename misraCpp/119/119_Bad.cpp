#include <iostream>

void fn()
{
    int32_t j = -1;
    for (int32_t i = 0; i != 10 && j != i; ++i)
    {
        if ((i % 2) == 0)
        {
            // 올바른 타입의 for 루프 내에서만 continue를 사용 해야합니다.
            continue;
        }
        // ...
        ++j;
    }
}

int main(void){return 0;}