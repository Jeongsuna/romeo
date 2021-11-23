#include <cstdint>
#define QUALIFIER volatile

void f2(QUALIFIER int32_t p)
{
    while (p != 0)
    {
        ;                   /* Wait... */
    }
}

#undef QUALIFIER        /* Non-compliant */

int fake_main() {
    f2(3);
    return 0;
}