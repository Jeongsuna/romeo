#include <iostream>
#include <stdint.h>

int main()
{
    char c = 11;
    int8_t a = c; // Non-compliant – explicitly signed
    std::cout << "a: " << static_cast<int>(a) << std::endl;

    uint8_t b = '\r'; // Non-compliant – explicitly unsigned
    std::cout << "b: " << static_cast<int>(b) << std::endl;

    signed char e = 11; // Compliant with this rule, but breaks Rule 3–9–2
    std::cout << "e: " << static_cast<int>(e) << std::endl;

    return 0;
}
