#include <iostream>

class A 
{ 
public:
    A() { std::cout << "A's constructor called" << std::endl; }
};

void f2 () // Compliant - declaring a function at global scope 
{ 
    std::cout << "Function f1 called" << std::endl;
}

A a; // Compliant - declaring an object 'a' of class 'A' at global scope

void b2 ( ) 
{ 
    // Now you can use 'f1' and 'a' inside this function
    f2();
}

int main() {
    b2();
    return 0;
}
