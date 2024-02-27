#include <iostream>

extern void f ( void ) {
}

int main() {
    if ( 0 == f ) // Non-Compliant
    {
        // ...
    }

    void (*p)( void ) = f; // Non-Compliant

    return 0;
}
