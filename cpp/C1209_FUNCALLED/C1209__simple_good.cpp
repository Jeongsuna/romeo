#include <stdint.h>

void function_4() 
{ 
}

void function_5() // Now Complinant
{ 
}

void function_6(); // Compliant prototype

int32_t main() 
{ 
    function_4();
    function_5();
    return 0; 
}
