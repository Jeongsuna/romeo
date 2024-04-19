#include <iostream>
#include <stdint.h>

void fn(int16_t i) {
    // Non-compliant function implementation
    std::cout << "Function fn called with i = " << i << std::endl;
}

int main() {
    int16_t i; 
    { 
        int16_t i; // This is a different variable 
        // This is Non-compliant 
        i = 3; // It could be confusing as to which i this refers 
        std::cout << "Inner scope i = " << i << std::endl;
    }
    fn(i);

    return 0;
}
