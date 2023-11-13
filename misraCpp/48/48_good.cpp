#include <iostream>
#include <cstdint>

void f(int32_t k);

void f(int32_t k) {
    { 
        int32_t j = k * k; // Compliant
        int32_t i = j; // Compliant
        std::cout << i << " " << j << std::endl; 
    } 
}

int main() {
    f(5);
    return 0;
}
