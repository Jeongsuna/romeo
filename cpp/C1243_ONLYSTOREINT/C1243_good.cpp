#include <iostream>
#include <cstdint>#include <stdint.h>
int main() {
    int8_t a = 97; // Compliant – using ASCII value of 'a'
    std::cout << "a: " << a << std::endl;

    uint8_t b = 13; // Compliant – using ASCII value of '\r'
    std::cout << "b: " << static_cast<int>(b) << std::endl;

    int8_t c = 10; // Compliant 
    std::cout << "c: " << static_cast<int>(c) << std::endl;

    uint8_t d = 12U; // Compliant 
    std::cout << "d: " << static_cast<int>(d) << std::endl;

    int8_t e = 11; // Using int8_t instead of signed char to comply with Rule 3–9–2
    std::cout << "e: " << static_cast<int>(e) << std::endl;

    return 0;
}
