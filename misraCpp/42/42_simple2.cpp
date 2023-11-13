#include <iostream>

extern int64_t a; // Non-compliant – not compatible 
extern int32_t b [ 5 ]; // Compliant 
int16_t c; // Non-compliant
char32_t f1 ( ); // Non-compliant 
char32_t f2 ( char32_t ); // Compliant – not the same function as 

int64_t a = 10;
int32_t b[5] = {1, 2, 3, 4, 5};
int16_t c = 20;

char32_t f1() {
    return 'a';
}

char32_t f2(char x) {
    return x;
}

int main() {
    std::cout << "a: " << a << std::endl;
    std::cout << "b[0]: " << b[0] << std::endl;
    std::cout << "c: " << c << std::endl;
    std::cout << "f1(): " << f1() << std::endl;
    std::cout << "f2('b'): " << f2('b') << std::endl;

    return 0;
}
