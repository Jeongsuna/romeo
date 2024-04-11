#include <iostream>

// classes used for exception handling
class B { };

class D: public B { };

int main(){
    try
    {
        // ...
    }
    // Compliant – Derived class caught before base class
    catch ( D &d )
    {
        // ...
    }
    // Compliant – Base class caught after derived class
    catch ( B &b )
    {
        // ...
    }
    return 0;
}