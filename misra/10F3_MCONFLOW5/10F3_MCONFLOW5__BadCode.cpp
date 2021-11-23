#include "stdbool.h"
#include <cstdint>

#define MAX 10


bool_t f(uint16_t n, char* p)
{
    if (n > MAX)
    {
        return false;
    }

    if (p == NULL)
    {
        return false;
    }

    return true;
}

int main() {
    f(0, 0);
    return 0;
}