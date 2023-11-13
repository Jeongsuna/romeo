#include <iostream>
#include <stdint.h>

int16_t with_unreach ( int16_t para ) 
{
    int16_t local;
    local = 0;
    switch ( para ) 
    {
        case 1: 
        { 
            // Compliant 
            local = para;
            break; 
        }
        default: 
        { 
           break; 
        }
    } 
    // Compliant 
    return para; 
    // para++;  Removed 
}

int main() {
    int16_t result = with_unreach(1);
    std::cout << "결과: " << result << std::endl;
    return 0;
}