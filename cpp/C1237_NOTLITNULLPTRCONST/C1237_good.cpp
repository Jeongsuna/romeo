#include <iostream>
#include <cstddef>
#include <stdint.h>

// 함수 정의
void f1(int32_t val)
{
    std::cout << "f1: " << val << std::endl;
}

void f2(int32_t *val)
{
    if (val == nullptr)
    {
        std::cout << "f2: nullptr" << std::endl;
    }
    else
    {
        std::cout << "f2: " << *val << std::endl;
    }
}

void f3()
{
    f1(0);       // Compliant
    f2(nullptr); // Compliant, nullptr used as the null pointer constant
}

int main()
{
    int val = 10;
    f1(val);
    f2(&val);
    f3();
    return 0;
}
