#include <cstdint>

int main()
{
    uint16_t u16a = 1, u16b = 2;
    uint32_t u32a = 3, u32b = 4;

    u32a* u16a + u16b;                    /* No composite conversion */
    (u32a * u16a) + u16b;                /* No composite conversion */
    u32a* ((uint32_t)u16a + u16b);      /* Both operands of * have
                                               * same essential type */
    u32a += (u32b + u16b);               /* No composite conversion */

    return 0;
}