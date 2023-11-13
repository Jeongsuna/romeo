#include <iostream>

struct S
{
    int32_t i;
    int32_t j;
};

void f(S* s)
{
    // S* s 포인터를 int32_t 정수로 변환하려고 시도하고 있습니다.(비준수)
    int32_t p = reinterpret_cast<int32_t>(s);
}

int main(void){return 0;}