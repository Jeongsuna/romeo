#include <cstdint>

int fake_main()
{
    uint32_t s32a = 1, s32b = 1;
    uint16_t u16a = 2, u16b = 2;
    (uint16_t)(s32a + s32b);    /* Non-compliant - different essential
                                     * type category */
    (uint32_t)(u16a + u16b);    /* Non-compliant - cast to wider
                                         * essential type */

    return 0;
}