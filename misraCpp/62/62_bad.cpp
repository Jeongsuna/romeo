#include <cstdint>

void f() 
{ 
    int32_t s32 = 0; 
    int16_t s16;
    s16 = static_cast<int16_t>(s32); // Non-compliant 
}

int main() 
{
    f();
    return 0;
}
