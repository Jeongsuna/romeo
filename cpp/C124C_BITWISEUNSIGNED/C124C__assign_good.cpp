#include <cstdint>
#include <iostream>

int bad() {
    uint16_t uint16_a;

    uint16_a &= 0x1234; // Compliant

    return 0;
}
