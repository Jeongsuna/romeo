#include <iostream>
#include <cctype>
#include <stdint.h>

int main() {
    char ch = 't'; // Compliant 
    uint8_t v;

    if ( islower(ch) ) // Compliant 
    {     
        if ( ( ch >= '0' ) && ( ch <= '9' ) ) {// Compliant by exception 
         
        }
    }

    if ( isdigit(ch) ) // Compliant 
    { 
        v = ch - '0'; // Compliant by exception 
    }

    ch = '0' + v; // Compliant by exception 

    return 0;
}
