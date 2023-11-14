#include <iostream>

void myfunc( int16_t * param1, 
             const int16_t * param2, 
             const int16_t * param3, 
             const int16_t * const param4) 
// param1: Addresses an object which is modified - Compliant 
// param2: Addresses an object which is not modified – Compliant 
// param3: Addresses an object which is not modified – Compliant 
// param4: Addresses an object which is not modified – Compliant 
{ 
    *param1 = *param2 + *param3 + *param4; 
    // Data at address param3 and param4 have not been changed 
}

int main(void){return 0;}