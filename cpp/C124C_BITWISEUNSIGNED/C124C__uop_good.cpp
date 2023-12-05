#include <cstdint>
#include <iostream>

enum Gender {MALE, FEMALE, OTHERS};

int main() {
    int16_t int16_a = 0x1111;

    if (~uint16_a == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    if (~5 == 0x1234U) { // Compliant
        std::cout << "Compliant bitwise operation passed.\n";
    }

    return 0;
}
