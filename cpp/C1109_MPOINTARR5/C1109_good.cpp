#include <cstdint>

typedef int8_t * INTPTR;

struct s {
    int8_t * s1; // Compliant
    int8_t ** s2; // Compliant
};

struct s * ps1; // Compliant
struct s ** ps2; // Compliant

int8_t ** ( *pfunc1)(); // Compliant
int8_t ** ( **pfunc2)(); // Compliant

void function( int8_t * par1, // Compliant
               int8_t ** par2, // Compliant
               INTPTR * par4, // Compliant
               int8_t * par6[] // Compliant
)
{
    int8_t * ptr1; // Compliant
    int8_t ** ptr2; // Compliant
    INTPTR * ptr4; // Compliant
    int8_t * ptr6[ 10 ]; // Compliant
    int8_t ** ptr7[ 10 ]; // Compliant
}

int main() {
    return 0;
}
