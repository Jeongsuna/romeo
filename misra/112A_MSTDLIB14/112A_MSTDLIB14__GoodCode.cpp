#include <stdio.h>
#include <string.h>
#include <cstdint>

/* The following definition violates other guidelines */
unsigned char headerStart[6] = { 'h', 'e', 'a', 'd', 0, 164 };

void f2(const uint8_t* packet)
{
    /* The following use of memcmp is compliant */
    if ((NULL != packet) && (memcmp(packet, headerStart, 6) == 0))
    {
        /*
         * Comparison of values having essentially unsigned type reports that
         * contents are the same. Any null terminator is simply treated as a
         * zero values and any differences beyond it are significant.
         */
    }
}

int main()
{
    return 0;
}