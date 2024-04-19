#include <iostream>

typedef char char_t;

int main() {
    char_t a = 10; // Non-compliant 
    std::cout << "c: " << a << std::endl;

    char d = 'd'; // Compliant with this rule, but breaks Rule 3–9–2
    std::cout << "d: " << d << std::endl;

    return 0;
}
