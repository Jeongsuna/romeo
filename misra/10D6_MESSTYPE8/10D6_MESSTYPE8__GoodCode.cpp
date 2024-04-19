#include <stdint.h>

int main()
{
    int16_t s16a = 1, s16b = 1;
    int32_t s32a = 1, s32b = 1;
    uint16_t u16a = 2, u16b = 2;
    uint32_t u32a = 2, u32b = 2;

    (uint16_t)(u32a + u32b); // Compliant
    (uint16_t)s32a; // Compliant
    uint16_t test3 = u32a + u32b; // Compliant
    uint32_t test4 = (uint32_t)u16a + (uint32_t)u16b; // Compliant
	
    return 0;
}
