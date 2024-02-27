#include <iostream>

extern void f ( void ) {
}

int main() {
    if ( 0 == &f ) // Compliant
    {
        (f)();
    }

    void (*q)( void ) = &f; // Compliant

    return 0;
}
