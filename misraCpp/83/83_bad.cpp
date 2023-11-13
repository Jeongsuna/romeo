#include <iostream>
#include <cstdint>

void f(int32_t)
{
    reinterpret_cast<void(*)()>(&f); // Non-compliant
    reinterpret_cast<void*>(&f); // Non-compliant
}

int main()
{
    std::cout << "Hello, World!" << std::endl;
    f(10);
    return 0;
}
