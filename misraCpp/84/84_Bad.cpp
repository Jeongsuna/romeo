#include <iostream>

struct S
{
    int32_t i;
    int32_t j;
};

class C
{
public:
    int32_t i;

public:
    int32_t j;
    virtual ~C();
};

void f(S* s)
{
    // 포인터 타입의 개체를 직접 또는 간접적으로 관련 없는 포인터 타입으로 변환하고 있습니다.(비준수) 
    C* c = reinterpret_cast<C*>(s);
    C* d = reinterpret_cast<C*>(i);

}
int main(void){return 0;}