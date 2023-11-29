#include <iostream>
#include <stdint.h>

void infeas ( uint8_t para, uint8_t outp ) 
{
    // The condition below will always be true hence the path 
    // for the false condition is infeasible. Non-compliant. 
    if ( para >= 0U ) 
    { 
        outp = 1U; 
    }
    // The following if statement combines with the if 
    // statement above to give four paths. One from 
    // the first condition is already infeasible and 
    // the condition below combined with assignment above 
    // makes the false branch infeasible. There is therefore 
    // only one feasible path through this code. 
    if ( outp == 1U ) 
    { 
        outp = 0U; 
    } 
}

int main() {
    uint8_t para = 0;
    uint8_t outp = 0;
    infeas(para, outp);
    
    enum ec { RED, BLUE, GREEN } col;
    if ( col <= GREEN ) // Non-compliant – always true 
    { 
        // Will always get here 
        std::cout << "col <= GREEN" << std::endl;
    } 
    else 
    { 
        // Will never get here
        std::cout << "col > GREEN" << std::endl;
    }

    // The following ifs exhibit similar behaviour. 
    // Note that u16a is a 16-bit unsigned integer 
    // and s8a is an 8-bit signed integer.
    uint16_t u16a = 0;
    int8_t s8a = 0;

    if ( u16a < 0U ) {} // Non-compliant – u16a is always >= 0
    if ( u16a <= 0xffffU ) {} // Non-compliant – always true
    if ( s8a < 130 ) {} // Non-compliant – always true
    if ( ( s8a < 10 ) && ( s8a > 20 ) ) {} // Non-compliant – always false
    if ( ( s8a < 10 ) || ( s8a > 5 ) ) {} // Non-compliant – always true

    // Nested conditions can also cause problems 
    if ( s8a > 10 ) 
    { 
        if ( s8a > 5 ) {} // Non-compliant, unless s8a volatile
        { 
            // Will always get here. 
            std::cout << "s8a > 10" << std::endl;
        } 
    }

    return 0;
}