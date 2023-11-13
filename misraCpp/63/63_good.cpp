#include <iostream>
#include <cstdint>

void f1 ( ) 
{ 
    int16_t s16a = 10; 
    int16_t s16b = 2; 
    float f32a;

    // The following performs floating-point division 
    f32a = static_cast< float > ( s16a ) / static_cast< float > ( s16b ); // Compliant 

    std::cout << "The result of the division is: " << f32a << std::endl;
}

int main() {
    f1();
    return 0;
}
