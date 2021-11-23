#include <cstdint>
/* Non-compliant - uses static in array declarator */
uint16_t total2(uint16_t n, static uint16_t a[20])
{
    uint16_t i;

    uint16_t sum = 0U;

    /* Undefined behaviour if a has fewer than 20 elements */
    for (i = 0U; i < n; ++i)
    {
        sum = sum + a[i];
    }

    return sum;
}

extern uint16_t v1_2[10]{};
extern uint16_t v2_2[20]{};

void g2(void)
{
    uint16_t x;

    x = total2(10U, v1_2);    /* Undefined - v1 has 10 elements but needs
                                * at least 20 */

    x = total2(20U, v2_2);    /* Defined but non-compliant */
}

int fake_main() {
    g2();
    return 0;
}