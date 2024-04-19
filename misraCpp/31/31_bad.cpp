#include <iostream>

void f1 ( ) 
{ 
    enum TYPE { }; 
}

void f2 ( ) 
{ 
    union TYPE { }; // Non-compliant 
}

namespace A
{
    class TYPE { }; // Complient-exception
}


int main() {
    f1();
    f2();
    std::cout << "Hello, World!";
    return 0;
}
