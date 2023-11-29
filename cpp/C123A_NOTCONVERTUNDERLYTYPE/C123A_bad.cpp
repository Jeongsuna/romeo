#include <iostream>
#include <stdint.h>

void f()
{
    int32_t s32;
    int8_t s8;
    s32 = s8 + s8;                       // Example 1 – Non-compliant
    s32 = static_cast<int32_t>(s8+s8);   // Example 1 – Non-compliant   
    s32 = static_cast<int32_t>(s8) + s8; // Example 2 - Compliant
    s32 = s32 + s8;                      // Example 3 - Compliant
    int32_t s32_1 = s8 + s8;             // Example 4 - Non-compliant    
}

int main()
{
    f();
    return 0;
}
