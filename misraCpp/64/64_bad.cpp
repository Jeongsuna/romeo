#include <iostream>
#include <cstdint>

void f ( ) 
{ 
    int16_t s16 = 10; 
    int32_t s32;
    s32 = static_cast< int32_t > ( s16 + s16 ); // Non-compliant
    std::cout << "s32: " << s32 << std::endl;
}

int main() {
    f();
    return 0;
}
