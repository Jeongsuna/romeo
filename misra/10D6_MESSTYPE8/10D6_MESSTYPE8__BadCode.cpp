#include <stdint.h>

int main()
{
    int16_t s16a = 1, s16b = 1;
    int32_t s32a = 1, s32b = 1;
    uint16_t u16a = 2, u16b = 2;
    uint32_t u32a = 2, u32b = 2;

    (uint16_t)(s32a + s32b); // Non-compliant - different essential type category
    (uint32_t)(u16a + u16b); // Non-compliant - cast to wider essential type
    uint16_t test = s32a + s32b; // Non-compliant - different essential type category
    uint32_t test2 = u16a + u16b; // Non-compliant - cast to wider essential type
    
    return 0;
}
