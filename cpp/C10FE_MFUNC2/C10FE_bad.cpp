#include <iostream>

int32_t fn(int32_t x)
{
    if (x > 0)
    {
        // 함수가 직접 또는 간접적으로 자신을 호출하고 있습니다.(비준수)
        x = x * fn(x - 1);
    }
    return x;
}

long fn(long x)
{
    int y = 10;
    if (x > 0)
    {
        // 함수가 직접 또는 간접적으로 자신을 호출하고 있습니다.(비준수)
        x = x * fn(x - 1);
    }
    return x;
}

int main(void){return 0;}