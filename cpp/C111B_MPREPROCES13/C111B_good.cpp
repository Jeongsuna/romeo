#include <cstdint>
#define AAA 2

int32_t foo(void)
{
    int32_t x = 0;

#ifndef AAA
    x = 1;
// #else 지시문 뒤에 아무런 문자나 숫자가 없습니다.(준수)
#else
    x = AAA;
#endif

    return x;
}

int main()
{
    return 0;
}