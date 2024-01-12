#include <cstdint>

void fn() 
{ 
    union // Breaks Rule 9–5–1 
    { 
        int u1;
        long u2;
    } a;

    a.u1 = a.u2; // Non-compliant
}

void fn()
{
    union // Breaks Rule 9–5–1
    {
        A<int>* u1;
        A<int>* u2;
    } a;

    a.u1 = a.u2; // Non-compliant
}
