#include <iostream>
#include <cstdint>

void f(int32_t)
{
    void (*fp)(int32_t) = &f;
}

int main()
{
    std::cout << "Hello, World!" << std::endl;
    f(10);
    return 0;
}
