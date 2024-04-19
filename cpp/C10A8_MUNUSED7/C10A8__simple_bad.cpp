#include <iostream>

typedef int (*CallbackFn)(int a, int b);

int Callback_1(int a, int b) // Compliant 
{ 
    return a + b; 
}

int Callback_2(int a, int b) // Non-compliant 
{ 
    return a; 
}

int Callback_3(int, int b) // Compliant by exception 
{ 
    return b; 
}

void Dispatch(int n, int a, int b, int c, int) // Non-compliant if Dispatch not a callback. 
{ 
    CallbackFn pFn;
    switch (n) 
    { 
        case 0: pFn = &Callback_1; break; 
        case 1: pFn = &Callback_2; break; 
        default: pFn = &Callback_3; break; 
    } 
    (*pFn)(a, b); 
}

int main() {
    Dispatch(0, 10, 20, 30, 40);
    return 0;
}
