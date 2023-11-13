#include <iostream>
#include <cstdint>

void f()
{
    int8_t s8 = -1;
    uint8_t u8 = 2;
    s8 = static_cast<int8_t>(u8);       // Compliant
    u8 = static_cast<uint8_t>(s8) + u8; // Compliant
}

int main() {
    f();
    std::cout << "Function executed successfully.\n";
    return 0;
}
