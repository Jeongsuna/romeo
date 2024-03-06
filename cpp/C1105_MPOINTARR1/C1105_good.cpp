#include <iostream>

void C1247_3 ( int32_t (&a1)[10] ) 
{ 
    int32_t a2[ 10 ];
    const int32_t * p1 = &a1 [ 1 ]; // Now compliant – a1 is an array 
    if (sizeof(a2)/sizeof(a2[0]) > 11) {
        int32_t * p3 = &a2 [ 11 ]; // Now compliant 
    }
}

void C1247_4 ( ) 
{ 
    int32_t c [ 10 ];
    C1247_3 ( c ); 
}

int main() {
    C1247_4();
    return 0;
}
