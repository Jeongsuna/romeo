#include <cstdint>
#define AAA 2

int32_t foo(void)
{
    int32_t x = 0;

#ifndef AAA
    x = 1;
// #else 지시문뒤에 숫자 1이 오고있습니다.(비준수)
#else1
    x = AAA;
#endif

    return x;
}

int main()
{
    return 0;
}