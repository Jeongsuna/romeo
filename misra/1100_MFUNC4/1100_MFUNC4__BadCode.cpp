#include <cstdint>
#define V_MIN 0
#define V_MAX 10

int32_t absolute(int32_t v)
{
    if (v < 0)
    {
        return v;
    }

    /*
     * Non-compliant - control can reach this point without
     * returning a value
     */
}

uint16_t lookup2(uint16_t v)
{
    uint16_t table[5] = { 1,2,3,4,5 };

    if ((v < V_MIN) || (v > V_MAX))
    {
        /* Non-compliant - no value returned. Constraint in C99 */
        return 0;
    }

    return table[v];
}

int fake_main()
{
    lookup2(0);
    return 0;
}