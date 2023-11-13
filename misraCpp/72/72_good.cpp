#include <iostream>

void f1 ( const int32_t * a1, size_t size ) 
{ 
    int32_t a2[ 10 ];
    const int32_t * p1 = a1; // Compliant – a1 is a pointer 
    if (size > 10) {
        size = 10;
    }
    int32_t * p2 = &a2 [ size - 1 ]; // Compliant 
}

void f2 ( ) 
{ 
    int32_t b; 
    int32_t c [ 10 ];
    f1 ( &b, 1 ); 
    f1 ( c, sizeof(c)/sizeof(c[0]) ); 
}

int main() {
    f2();
    return 0;
}
