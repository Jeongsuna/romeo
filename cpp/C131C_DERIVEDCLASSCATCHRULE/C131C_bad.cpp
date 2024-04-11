#include <iostream>

// classes used for exception handling
class A { };
class B { };
class C { };
class F : public A, public B, public C {};
class D: public B { };
class E : public A, public B { };


int main(){
    try
    {
        // ...
    }
    // Non-compliant – will catch derived classes as well
    catch ( B &b )
    {
        // ...
    }
    // Non-compliant – Derived class will be caught above
    catch ( D &d )
    {
        // Any code here will be unreachable,
        // breaking Rule 0–1–1
    }
    return 0;
}