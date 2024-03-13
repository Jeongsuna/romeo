#include <iostream>

extern int32_t C1229_b [ 5 ]; // Compliant 
char32_t C1229_f2 ( char32_t ); // Compliant – not the same function as 

int32_t C1229_b[5] = {1, 2, 3, 4, 5};

char32_t C1229_f2(char x) {
    return x;
}

int main() {
    std::cout << "C1229_b[0]: " << C1229_b[0] << std::endl;
    std::cout << "C1229_f2('C1229_b'): " << C1229_f2('b') << std::endl;

    return 0;
}
