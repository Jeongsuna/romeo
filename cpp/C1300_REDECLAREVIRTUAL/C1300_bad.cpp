#include <iostream>

class A
{
public:
    virtual void boo() = 0; // boo declared pure
};

class C : public A
{
public:
    virtual void boo() = 0; // Non-compliant – boo re-declared pure
};

int main(void){return 0;}