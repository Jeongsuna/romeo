#include <iostream>
#include <stdint.h>

void f()
{
    float f32 = 1.0f;
    int32_t s32 = 2;
    s32 = f32; // Non-compliant 
    f32 = s32;   // Non-compliant 
}

int main() {
    f();
    std::cout << "Function executed successfully.\n";
    return 0;
}
