#include <iostream>

typedef char char_t;

int main() {
    char_t a = 'a'; // Compliant 
    std::cout << "a: " << a << std::endl;

    char_t b = '\r'; // Compliant 
    std::cout << "b: " << b << std::endl;

    char_t d = 'd'; // Now compliant with Rule 3–9–2
    std::cout << "d: " << d << std::endl;

    return 0;
}
