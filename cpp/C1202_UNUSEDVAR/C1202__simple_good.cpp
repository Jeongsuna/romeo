#include <iostream>
#include <stdint.h>

extern void usefn ( int16_t a, int16_t b );

class C 
{ 
public:
    void print() {
        std::cout << "C instance used!" << std::endl;
    }
};

C c; // Now-compliant

void withunusedvar ( void ) 
{ 
    int16_t unusedvar = 10; // Now-compliant
    struct s_tag 
    { 
        signed int a : 3; 
        signed int : 1; // Modified: Unnamed padding bit field
        signed int b : 2; 
    } s_var;

    s_var.a = 0; 
    s_var.b = 0; 

    usefn ( s_var.a + unusedvar, s_var.b + unusedvar ); 
}

int main() {
    withunusedvar();
    c.print();
    return 0;
}
