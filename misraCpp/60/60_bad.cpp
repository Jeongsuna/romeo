#include <iostream>
#include <cstdint>

void f()
{
    int8_t s8 = -1;
    uint8_t u8 = 2;
    s8 = u8;                            // Non-compliant
    u8 = s8 + u8;                       // Non-compliant
}

int main() {
    f();
    std::cout << "Function executed successfully.\n";
    return 0;
}
