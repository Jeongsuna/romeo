# include <iostream>

// classes used for exception handling
class B { };

class D: public B { };

int main(){
    try
    {
        // ...
    }
    catch ( D &d ) // Compliant – Derived class caught before base class
    {
        // ...
    }
    catch ( B &b ) // Compliant – Base class caught after derived class
    {
        // ...
    }
    return 0;
}