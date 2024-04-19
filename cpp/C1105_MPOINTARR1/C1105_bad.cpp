#include <iostream>

void C1247_1 ( const int32_t * a1 ) 
{ 
    int32_t a2[ 10 ];
    const int32_t * p1 = &a1 [ 11 ]; // Non-compliant – a1 not an array 
    int32_t * p3 = &a2 [ 11 ]; // Non-compliant 
}

void C1247_2 ( ) 
{ 
    int32_t b; 
    int32_t c [ 10 ];
    C1247_1 ( &b ); 
    C1247_1 ( c ); 
}

int main() {
    C1247_2();
    return 0;
}
