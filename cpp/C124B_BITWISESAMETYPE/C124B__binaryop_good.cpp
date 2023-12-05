#include <iostream>

int main() {
    uint8_t mask = ~(0x10); 
    uint8_t value;
    value = value | mask; // Non-compliant
    std::cout << "Value: " << value << std::endl;
    return 0;
}
