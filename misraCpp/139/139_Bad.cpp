#include <iostream>

class Base
{
public:
    virtual void b1(int32_t a = 0);
};

class Derived : public Base
{
public:
    // 다른 기본인수(값)를 지정하고 있습니다.(비준수)
    virtual void b1(int32_t a = 10);
};

void f(Derived& d)
{
    Base& b = d;
    // 기본값 0을 사용합니다.
    b.b1();
    // 기본값 10을 사용합니다.
    d.b1();
}

int main(void){return 0;}