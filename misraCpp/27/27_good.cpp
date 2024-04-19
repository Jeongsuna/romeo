#include <iostream>
#include <cstdint>

void fn(int32_t i) 
{ 
    // Remove Code Section 
    for (int32_t j = 0; j != i; ++j) 
    { 
        std::cout << "This is loop iteration: " << j << std::endl;
    } 
}

int main() {
    fn(5);
    return 0;
}
