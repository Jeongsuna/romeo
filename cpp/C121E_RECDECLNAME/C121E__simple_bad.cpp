#include <iostream>

void f1 ( ) 
{ 
    enum TYPE { }; 
}

void f2 ( ) 
{ 
    union TYPE { }; // Non-compliant 
}

class TYPE { }; // Non-compliant


int main() {
    f1();
    f2();
    std::cout << "Hello, World!";
    return 0;
}
