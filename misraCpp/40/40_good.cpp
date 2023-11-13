#include <iostream>

class A 
{ 
public:
    A() { std::cout << "A's constructor called" << std::endl; }
};

void f1 () // Compliant - declaring a function at global scope 
{ 
    std::cout << "Function f1 called" << std::endl;
}

A a; // Compliant - declaring an object 'a' of class 'A' at global scope

void b1 ( ) 
{ 
    // Now you can use 'f1' and 'a' inside this function
    f1();
}

int main() {
    b1();
    return 0;
}
