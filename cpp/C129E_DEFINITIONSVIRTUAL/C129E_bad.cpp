#include <iostream>

class A
{
public:
    virtual void f1 ( ) = 0; // f1 is pure
    virtual void f2 ( ) = 0; // f2 is pure
    virtual void f3 ( ) { } // f3 is not pure
    virtual void f4 ( ) = 0; // f4 is pure
    virtual ~A(); // destructor
};

// A::f1 is both pure and has a definition
void A::f1 ( )
{
}
// A::f4 is both pure and has a definition
void A::f4 ( )
{
}

class B : public A
{
public:
    virtual void f2 ( ) { } // Compliant: f2 pure in A and defined in B
    virtual void f3 ( ) { } // Non-compliant: f3 defined in A and B
    virtual void f4 ( ) = 0; // Compliant: f4 is pure in A and in B
    virtual ~B(); // Compliant: destructor
};

// Compliant by Exception - f4 defined in A but also declared pure in A
void B::f4 ( )
{
}

class C : public B
{
public:
    virtual void f1 ( ) { } // Compliant: f1 defined in A and C but was pure in A
    virtual void f2 ( ) { } // Non-compliant f2: defined in B and C and not declared pure in B
    virtual void f4 ( ) { } // Compliant by Exception: f4 defined in A and B but also declared pure in A and B
};

class D : public C
{
public:
    virtual void f1 ( ) { } // Non-compliant f1: defined in C and D as well as A
    virtual ~D();  // Compliant: destructor
};

// Call by dominance example
class V
{
public:
    virtual void foo ( )
    {
    }
};

class B1 : public virtual V
{
public:
    virtual void foo ( ) // Non-compliant
    {
    }
};

class B2 : public virtual V
{
public:
    void f1 ( )
    {
        foo(); // V::foo would appear to be the only candidate to be called here
    }
};

class E : public B1, public B2
{
public:
    void f2 ( )
    {
        f1();
    }
};
int main(void){
    B2 b2;
    b2.f1(); // calls V::foo by normal inheritance rules
    E e;
    e.f2(); // calls B2::f1 which now calls B1::foo "by dominance"
    e.f1(); // also calls B1::foo "by dominance"

    return 0;
}