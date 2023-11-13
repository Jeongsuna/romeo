#include <iostream>

int main() {
    uint8_t mask = ~(0x10); 
    uint16_t value;
    value ^= mask; // Non-compliant
    std::cout << "Value: " << value << std::endl;
    return 0;
}
