#include <iostream>
#include <cstdint>

void f ( ) 
{ 
    uint8_t u8 = 10; 
    int8_t s8;
    s8 = static_cast< int8_t >( u8 + u8 ); // Non-compliant 
    std::cout << "s8: " << static_cast<int>(s8) << std::endl;
}

int main() {
    f();
    return 0;
}
