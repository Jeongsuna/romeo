#include <iostream>
#include <stdint.h>

extern void usefn_2 ( int16_t a_2, int16_t b_2 );

class C_2 
{ 
public:
    void print_2() {
        std::cout << "C_2 instance used!" << std::endl;
    }
};

C_2 c_2; // Now-compliant

void withunusedvar_2 ( void ) 
{ 
    int16_t unusedvar_2 = 10; // Now-compliant
    struct s_tag_2 
    { 
        signed int a_2 : 3; 
        signed int : 1; // Modified: Unnamed padding bit field
        signed int b_2 : 2; 
    } s_var_2;

    s_var_2.a_2 = 0; 
    s_var_2.b_2 = 0; 

    usefn_2 ( s_var_2.a_2 + unusedvar_2, s_var_2.b_2 + unusedvar_2 ); 
}

int main() {
    withunusedvar_2();
    c_2.print_2();
    return 0;
}
