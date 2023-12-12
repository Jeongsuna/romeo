#include <cstdint>
#include <iostream>

enum Gender {MALE, FEMALE, OTHERS};

int main() {
    uint16_t uint16_a = 0x1111;

    if (~uint16_a == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    if (~5 == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    return 0;
}
