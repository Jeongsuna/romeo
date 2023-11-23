#include <iostream>

void f1 ( ) 
{ 
    enum TYPE { }; 
}

void f2 ( ) 
{ 
    union TYPE2 { }; // Compliant
}

namespace A
{
    class TYPE { }; // Compliant-exception
}


int main() {
    f1();
    f2();
    std::cout << "Hello, World!";
    return 0;
}
