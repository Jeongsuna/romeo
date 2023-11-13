#include <cstdint>

typedef int8_t * INTPTR;

struct s { 
    int8_t * s1; // Compliant 
    int8_t ** s2; // Compliant 
    // int8_t *** s3; // Non-compliant 
};

struct s * ps1; // Compliant 
struct s ** ps2; // Compliant 
// struct s *** ps3; // Non-compliant

int8_t ** ( *pfunc1)(); // Compliant 
int8_t ** ( **pfunc2)(); // Compliant 
// int8_t ** (***pfunc3)(); // Non-compliant 
// int8_t *** ( **pfunc4)(); // Non-compliant

void function( int8_t * par1, // Compliant 
               int8_t ** par2, // Compliant 
            //    int8_t *** par3, // Non-compliant 
               INTPTR * par4, // Compliant 
            //    INTPTR * const * const par5, // Non-compliant 
               int8_t * par6[] // Compliant 
            //    int8_t ** par7[]) // Non-compliant 
)
{
    int8_t * ptr1; // Compliant 
    int8_t ** ptr2; // Compliant 
    // int8_t *** ptr3; // Non-compliant
    INTPTR * ptr4; // Compliant
    // INTPTR * const * const ptr5; // Non-compliant 
    int8_t * ptr6[ 10 ]; // Compliant
    int8_t ** ptr7[ 10 ]; // Compliant 
}

int main() {
    return 0;
}
