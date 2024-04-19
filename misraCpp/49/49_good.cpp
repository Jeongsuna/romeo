#include <cstdint>

typedef int32_t INT;

extern INT i; // Compliant
INT i; 

extern INT j; // Compliant
INT j; 

extern void f ( int ); // Compliant
void f ( int ); 

extern void g ( int ); // Compliant
void g ( int );

int main() {
    i = 10;
    j = 20;
    f(i);
    g(j);
    return 0;
}

void f(int x) {
    // function body
}

void g(int y) {
    // function body
}
