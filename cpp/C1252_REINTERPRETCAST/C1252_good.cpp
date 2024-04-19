#include <iostream>
#include <cstdint>

void f(int)
{
    void (*fp)(int) = &f;
}

int main()
{
    std::cout << "Hello, World!" << std::endl;
    f(10);
    return 0;
}
