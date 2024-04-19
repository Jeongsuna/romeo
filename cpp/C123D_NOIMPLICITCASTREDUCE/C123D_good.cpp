#include <cstdint>

void C123D_1() 
{ 
    int32_t s32 = 0;
    int16_t s16;
    s16 = static_cast<int16_t>(s32); //Compliant
}

int main() 
{
    C123D_1();
    return 0;
}
