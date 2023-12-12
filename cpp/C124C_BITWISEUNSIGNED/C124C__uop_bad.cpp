#include <cstdint>
#include <iostream>

enum Gender {MALE, FEMALE, OTHERS};

int main() {
    int16_t int16_a = 0x1111;

    if (~int16_a == 0x1234U) { // Non-compliant
        std::cout << "Non-compliant bitwise operation passed.\n";
    }

    if (~-5 == 0x1234U) { // Non-compliant
        std::cout << "Non-compliant bitwise operation passed.\n";
    }

    return 0;
}
