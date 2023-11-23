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

C c; // Non-compliant - unused

void withunusedvar ( void ) 
{ 
    int16_t unusedvar; // Non-compliant – unused
    struct s_tag 
    { 
        signed int a : 3; 
        signed int pad : 1; // Non-compliant – should be unnamed 
        signed int b : 2; 
    } s_var;

    s_var.a = 0; 
    s_var.b = 0; 

    usefn ( s_var.a, s_var.b ); 
}

int main() {
    withunusedvar();
    return 0;
}
