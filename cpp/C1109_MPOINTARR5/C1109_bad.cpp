#include <cstdint>

typedef int8_t * INTPTR;

struct s {
    int8_t *** s3; // Non-compliant
};

struct s *** ps3; // Non-compliant

int8_t ** (***pfunc3)(); // Non-compliant
int8_t *** ( **pfunc4)(); // Non-compliant

void function( int8_t *** par3, // Non-compliant
               INTPTR * const * const par5, // Non-compliant
               int8_t ** par7[]) // Non-compliant
{
    int8_t *** ptr3; // Non-compliant
    INTPTR * const * const ptr5; // Non-compliant
}

int main() {
    return 0;
}
