#include <iostream>
#include <stdint.h>

extern void usefn_1 ( int16_t a_1, int16_t b_1 );

class C_1 
{ 
public:
    void print_1() {
        std::cout << "C_1 instance used!" << std::endl;
    }
};

C_1 c_1; // Now-compliant

void withunusedvar_1 ( void ) 
{ 
    int16_t unusedvar_1 = 10; // Now-compliant
    struct s_tag_1 
    { 
        signed int a_1 : 3; 
        signed int pad_1 : 1; // Modified: Unnamed padding bit field
        signed int b_1 : 2; 
    } s_var_1;

    s_var_1.a_1 = 0; 
    s_var_1.b_1 = 0; 

    usefn_1 ( s_var_1.a_1, s_var_1.b_1 ); 
}

int main() {
    withunusedvar_1();
    return 0;
}
