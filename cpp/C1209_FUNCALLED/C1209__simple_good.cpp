#include <stdint.h>

void f_1() 
{ 
}

void f_2() // Now Complinant
{ 
}

void f_3(); // Compliant prototype

int32_t main() 
{ 
    f_1();
    f_2();
    return 0; 
}
