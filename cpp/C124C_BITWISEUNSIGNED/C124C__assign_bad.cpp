#include <cstdint>
#include <iostream>

int bad() {
    uint16_t uint16_a;

    uint16_a &= -10; // Non-compliant

    return 0;
}
