#include <iostream>
#include "test.cpp"

namespace NS2 
{ 
    float WIDTH; // Compliant - 
    // NS2::WIDTH is not the same as NS1::WIDTH 
}

void f1 ( ) 
{ 
    typedef int TYPE; 
}

void f2 ( ) 
{ 
    float TYPE; // Non-compliant 
}