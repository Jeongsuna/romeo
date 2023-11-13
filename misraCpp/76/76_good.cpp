#include <iostream>

int main() {
    uint16_t mask = ~(0x10); 
    uint16_t value;
    value ^= mask; // Compliant
    std::cout << "Value: " << value << std::endl;
    return 0;
}