#include <iostream>

int with_unreach ( int para ) 
{
    int local;
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
    int result = with_unreach(1);
    std::cout << "결과: " << result << std::endl;
    return 0;
}