#include <iostream>

class Base1
{
public:
    virtual void g1(int32_t a = 0, int32_t b = 1);
    virtual void g2(int32_t c = 2);
    virtual void g3(int32_t d);
};

class Derived1 : public Base1
{
public:
    // Non-compliant - different value
    virtual void g1(int32_t a = 1, int32_t b = 0);
    // Non-compliant - different value
    virtual void g2(int32_t c = 3);
    // Non-compliant - different value
    virtual void g3(int32_t d = 3);
};

void f(Derived1& d)
{
    Base1& b = d;
    b.g1();
    d.g1();
    b.g2();
    d.g2(0);
}

int main(void){return 0;}