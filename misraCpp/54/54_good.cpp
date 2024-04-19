#include <iostream>
#include <cctype>

int main() {
    char ch = 't'; // Compliant 
    uint8_t v;

    if ( islower(ch) ) // Compliant 
    { 
    }

    if ( isdigit(ch) ) // Compliant 
    { 
        v = ch - '0'; // Compliant by exception 
        // v = ch - '1'; // Non-compliant 
    }

    ch = '0' + v; // Compliant by exception 
    // v = ch - '1'; // Non-compliant 

    return 0;
}
