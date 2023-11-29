#include <iostream>

void f1 ( ) 
{ 
    enum TYPE3 { }; 
}

void f2 ( ) 
{ 
    union TYPE4 { }; // Compliant
}

namespace A
{
    class TYPE3 { }; // Compliant-exception
}


int main() {
    f1();
    f2();
    std::cout << "Hello, World!";
    return 0;
}
