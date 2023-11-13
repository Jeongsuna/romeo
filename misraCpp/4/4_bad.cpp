#include <iostream>

const int x = 19; // Compliant 
const int y = 21; // Non-compliant

void usedonlyonce ( void ) 
{ 
    int once_1 = 42; // Non-compliant 
    int once_2;
    once_2 = x ; // Non-compliant 
}

int main() {
    usedonlyonce();
    return 0;
}
