#include <iostream>

class A
{
public:
    virtual void b();
};

class B1 : public A
{
public:
    void b(); // Non-compliant - implicitly virtual
};

int main(void){return 0;}