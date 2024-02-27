#include <iostream>

class Base2
{
public:
    virtual void g1(int32_t a = 0, int32_t b = 1);
    virtual void g2(int32_t c = 2);
    virtual void g3(int32_t d);
};

class Derived2 : public Base2
{
public:
    // Compliant - same default used
    virtual void g1(int32_t a = 0, int32_t b = 1);
    // Compliant - no default specified
    virtual void g2(int32_t c);
    // Compliant - same default used
    virtual void g3(int32_t d);
};

void f(Derived2& d)
{
    Base2& b = d;
    b.g1();
    d.g1();
    b.g2();
    d.g2(0);
}

int main(void){return 0;}