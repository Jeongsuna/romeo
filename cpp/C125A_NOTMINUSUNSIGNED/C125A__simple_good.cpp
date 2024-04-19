#include <iostream>
#include <cstdint>

int main() {
    uint8_t a = 1U; // Compliant
    std::cout << "a: " << static_cast<int>(a) << std::endl;

    int32_t b = -(int32_t)a; // Compliant
    std::cout << "b: " << b << std::endl;

    uint32_t c = 1U; 
    std::cout << "c: " << c << std::endl;

    int64_t d = -(int64_t)c; // Compliant
    std::cout << "d: " << d << std::endl;

    return 0;
}
