#include <stdint.h>

void function_1() 
{ 
}

void function_2() // Non-compliant 
{ 
}

void function_3(); // Compliant prototype

int32_t main() 
{ 
    function_1();
    return 0; 
}
