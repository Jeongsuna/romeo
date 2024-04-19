#include <iostream>
#include <stdint.h>

int main() {
    char ch = 't'; // Compliant 
    uint8_t v;

    if ( ( ch >= 'a' ) && ( ch <= 'z' ) ) // Non-compliant 
    { 
    }

    if ( ( ch >= '0' ) && ( ch <= '9' ) ) // Compliant by exception 
    { 
        v = ch - '1'; // Non-compliant 
    }

    ch = 'A' + v; // Non-compliant

    return 0;
}
