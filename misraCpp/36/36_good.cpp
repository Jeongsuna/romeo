#include <iostream>
#include <cstdint>

template <typename T> 
void f ( T t ) {
    std::cout << "General template\n";
}

template <> 
void f < uint16_t > ( uint16_t u16 ) {
    std::cout << "uint16_t template\n";
}

template <> 
void f < int16_t > ( int16_t i16 ) {
    std::cout << "int16_t template\n";
}

void b ( ) 
{ 
    uint16_t u16a = 0U; // Compliant
    f ( 0x8000U ); // Now compliant
    u16a = u16a + 0x8000U; // Now compliant
}

int main() {
    b();
    return 0;
}
