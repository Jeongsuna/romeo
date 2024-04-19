#include <iostream>
#include <cstdint>

int main() {
    uint8_t a = -1U; // Non-compliant – a is assigned 255 
    std::cout << "a: " << static_cast<int>(a) << std::endl;

    int32_t b = -a; // Non-compliant – b is assigned -255 
    std::cout << "b: " << b << std::endl;

    uint32_t c = 1U; 
    std::cout << "c: " << c << std::endl;

    int64_t d = -c; // Non-compliant – d is assigned MAX_UINT
    std::cout << "d: " << d << std::endl;

    return 0;
}
