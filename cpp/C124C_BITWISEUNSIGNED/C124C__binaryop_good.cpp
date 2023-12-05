#include <cstdint>
#include <iostream>

int main() {
    int16_t int16_a = 0x1111;
    int16_t int16_b = 0x2222;
    uint16_t uint16_a = 0x3333;
    uint16_t uint16_b = 0x4444;

    if ((uint16_a | uint16_b) == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    if ((10 & uint16_b) == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    return 0;
}
