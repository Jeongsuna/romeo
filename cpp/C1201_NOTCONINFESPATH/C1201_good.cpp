#include <iostream>
#include <stdint.h>

void feasible ( uint8_t para, uint8_t outp ) 
{
    // The condition below will be true if para is not equal to 0
    if ( para != 0U ) 
    { 
        outp = 1U; 
    }

    // The following if statement combines with the if 
    // statement above to give four paths. 
    if ( outp == 1U ) 
    { 
        outp = 0U; 
    } 
}

int main() {
    uint8_t para = 0;
    uint8_t outp = 0;
    feasible(para, outp);
    
    enum ec { RED, BLUE, GREEN } col;
    if ( col == GREEN ) // Compliant – not always true 
    { 
        // Will get here if col is GREEN
        std::cout << "col == GREEN" << std::endl;
    } 
    else 
    { 
        // Will get here if col is not GREEN
        std::cout << "col != GREEN" << std::endl;
    }

    // The following ifs exhibit similar behaviour. 
    // Note that u16a is a 16-bit unsigned integer 
    // and s8a is an 8-bit signed integer.
    uint16_t u16a = 0;
    int8_t s8a = 0;

    if ( u16a > 0U ) {} // Compliant – not always true
    if ( u16a < 0xffffU ) {} // Compliant – not always true
    if ( s8a < 127 ) {} // Compliant – not always true
    if ( ( s8a < 20 ) && ( s8a > 10 ) ) {} // Compliant – not always false
    if ( ( s8a < 10 ) || ( s8a > 5 ) ) {} // Compliant – not always true

    // Nested conditions can also cause problems 
    if ( s8a > 10 ) 
    { 
        if ( s8a < 20 ) {} // Compliant, unless s8a volatile
        { 
            // Will get here if s8a is between 10 and 20.
            std::cout << "10 < s8a < 20" << std::endl;
        } 
    }

    return 0;
}
