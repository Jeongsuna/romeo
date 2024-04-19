#include <cstdint>

typedef float float32_t;

float32_t My_fabs(float32_t f) 
{ 
    uint8_t * pB = reinterpret_cast< uint8_t * >( &f );
    *( pB + 3 ) &= 0x7f; // Non-compliant – generate the absolute value 
                        // of an IEEE-754 float value. 
    return ( f ); 
}

int main() {
    float32_t f = -3.14;
    float32_t abs_f = My_fabs(f);
    return 0;
}
