#include <cstdint>
#include "stdbool.h"
#include <ctype.h>
#include <cstdio>

bool_t f2(uint8_t a)
{
    return (isdigit((int32_t)a)     /* Compliant */
        && isalpha((int32_t)'b')   /* Compliant */
        && islower(EOF)   /* Compliant */
        && isalpha(256));    /* Non-compliant */
}

int fake_main() {
    f2(0);
    return 0;
}