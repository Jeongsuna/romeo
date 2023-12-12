#include <cstdint>
#include <iostream>

enum Gender {MALE, FEMALE, OTHERS};

int main() {
    uint16_t uint16_a = 0x3333;

    Gender gen = MALE;
    if ((uint16_a & gen) == 0x11U) { // Non-compliant
        std::cout << "Non-compliant bitwise operation passed.\n";
    }

    if (~gen == 0x1U) { // Non-compliant
        std::cout << "Non-compliant bitwise operation passed.\n";
    }

    return 0;
}
