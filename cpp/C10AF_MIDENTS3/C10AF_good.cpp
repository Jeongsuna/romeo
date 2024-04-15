#include <iostream>
#include <stdint.h>

void fn(int16_t param_i) {
    // Compliant function implementation
    std::cout << "Function fn called with param_i = " << param_i << std::endl;
}

int main() {
    int16_t outer_i; 
    { 
        int16_t inner_i; // This is a different variable 
        inner_i = 3; // It's clear which i this refers to
        std::cout << "inner_i = " << inner_i << std::endl;
    }
    fn(outer_i);

    return 0;
}
