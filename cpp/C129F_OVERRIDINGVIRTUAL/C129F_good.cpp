#include <iostream>

class A
{
public:
   virtual void g();
};

class B1 : public A
{
public:
   virtual void g(); // Compliant - explicitly declared "virtual"
};

int main(void){return 0;}