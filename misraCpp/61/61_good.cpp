#include <iostream>
#include <cstdint>

void f()
{
    float f32 = 1.0f;
    int32_t s32 = 2;
    s32 = static_cast<int32_t>(f32); // Compliant 
    f32 = static_cast<float>(s32);   // Compliant 
}

int main() {
    f();
    std::cout << "Function executed successfully.\n";
    return 0;
}
