#include <iostream>

class Base
{
public:
    virtual void g1(int32_t a = 0);
    virtual void g2(int32_t a = 0);
};

class Derived : public Base
{
public:
    // 기본 인수(값)를 사용합니다.(준수)
    virtual void g1(int32_t a = 0);
    // 새로운 기본 인수(값)를 지정하지 않습니다.(준수)
    virtual void g2(int32_t a);
};

void f(Derived& d)
{
    Base& b = d;
    // 기본값 0을 사용합니다.
    b.g1();
    // 기본값 0을 사용합니다.
    d.g1();
    // 기본값 0을 사용합니다.
    b.g2();
    // 새로운 기본값이 없으므로 명시적으로 값을 전달해야 합니다.
    d.g2(0);
}

int main(void){return 0;}