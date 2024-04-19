#include <stdint.h>

struct S 
{ 
    signed int a : 2; // Compliant 
    unsigned int b : 2; // Compliant 
    signed char d : 2; // Compliant 
    unsigned char e : 2; // Compliant 
    signed long f : 2; // Compliant 
    unsigned long g : 2; // Compliant  
    signed short h : 2; // Compliant 
    unsigned short i : 2; // Compliant  
    bool j : 2; // Compliant 
    uint32_t l : 2; // Compliant 
    int8_t m : 2; // Compliant 
};

int main() {
    return 0;
}