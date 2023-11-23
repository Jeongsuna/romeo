#include <stdint.h>

void f1() 
{ 
}

void f2() // Now Complinant
{ 
}

void f3(); // Compliant prototype

int32_t main() 
{ 
    f1();
    f2();
    return 0; 
}
