#include <iostream>

int with_unreach ( int para ) 
{
    int local;
    local = 0;
    switch ( para ) 
    {
        // unreachable – Non-compliant
        local = para; 
        case 1: 
        { 
            break; 
        }
        default: 
        { 
           break; 
        }
    } 
    return para;
    // unreachable – Non-compliant 
    para++;  
}

int main() {
    int result = with_unreach(1);
    std::cout << "결과: " << result << std::endl;
    return 0;
}