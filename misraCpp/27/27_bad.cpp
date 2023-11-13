#include <iostream>
#include <cstdint>

void fn(int32_t i) 
{ 
    // ++i; // We want to increment "i"
    for (int32_t j = 0; j != i; ++j) 
    { 
        std::cout << "This is loop iteration: " << j << std::endl;
    } 
}

int main() {
    fn(5);
    return 0;
}
