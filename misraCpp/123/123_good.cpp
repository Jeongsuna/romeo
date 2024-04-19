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
}

int main() {
    int16_t a = 5;
    int16_t b = 10;
    int16_t c = 15;
    int16_t d = 20;

    myfunc(&a, &b, &c, &d);

    std::cout << "The value of a after calling myfunc is: " << a << std::endl;

    return 0;
}
