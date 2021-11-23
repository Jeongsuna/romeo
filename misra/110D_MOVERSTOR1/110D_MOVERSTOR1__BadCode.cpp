#include <cstdint>
#include <string.h>

int16_t a2[20];

void fn(void)
{
    union
    {
        int16_t i;
        int32_t j;
    } a = { 0 };

    a.j = a.i;        /* Non-compliant */
}


void f2(void)
{
    memcpy(&a2[5], &a2[4], 2u * sizeof(a2[0]));  /* Non-compliant */
}

int fake_main()
{
    return 0;
}
