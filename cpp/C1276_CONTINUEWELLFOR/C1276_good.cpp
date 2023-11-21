#include <iostream>

void fn()
{
    
    for (int32_t i = 0; i != 10; ++i)
    {
        if ((i % 2) == 0)
        {
            // 올바른 타입 for 루프 내에서 continue를 사용하고 있습니다.
            continue; 
        // ...
        }
    }
}

int main(void){return 0;}