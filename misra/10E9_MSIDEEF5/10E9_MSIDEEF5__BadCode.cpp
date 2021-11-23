#include <cstdint>

uint16_t h2(uint16_t y)
{
    static uint16_t temp = 0;

    /* This side effect is persistent */
    temp = y + temp;

    return temp;
}

int fake_main()
{
    volatile uint16_t v = 1;
    uint16_t x = 1;
    uint16_t *fp;
    uint16_t ptr;
    fp = &ptr;

    /* Non-compliant - access to volatile v is persistent */
    if ((x == 0u) || (v == 1u))
    {
    }

    /* Non-compliant if fp points to a function with persistent side effects */
    (fp != NULL) && (*fp) && 0;
    
    return 0;
}