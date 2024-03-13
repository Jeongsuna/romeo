#include <iostream>

extern int64_t C1229_a; // Non-compliant – not compatible 
// int16_t C1229_c; // Non-compliant(not compile)
char32_t C1229_f1 ( ); // Non-compliant 

int64_t C1229_a = 10;
// int16_t C1229_c = 20;

char32_t C1229_f1() {
    return 'a';
}


int main() {
    std::cout << "C1229_a: " << C1229_a << std::endl;
    // std::cout << "C1229_c: " << C1229_c << std::endl;
    std::cout << "C1229_f1(): " << C1229_f1() << std::endl;

    return 0;
}
