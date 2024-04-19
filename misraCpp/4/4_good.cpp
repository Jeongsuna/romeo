#include <iostream>

const int x = 19; // Compliant 

void usedonlyonce ( void ) 
{ 
    int once_1 = 42; // Now compliant 
    once_1 = x; 

    int once_2 = x; // Non-compliant
    once_2 += once_1;
}

int main() {
    usedonlyonce();
    return 0;
}

