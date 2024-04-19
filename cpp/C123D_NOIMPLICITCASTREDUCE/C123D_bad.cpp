#include <cstdint>

void C123D_2( ) 
{ 
    int32_t s32; 
    int16_t s16;
    s16 = s32; // Non-compliant 
}

int main() 
{
    C123D_2();
    return 0;
}
