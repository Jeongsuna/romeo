#include <iostream>

class A
{
public:
    virtual void boo() = 0; // boo declared pure
};

class B : public A
{
public:
    virtual void boo(){ // Compliant - boo defined

    }
};

int main(void){return 0;}