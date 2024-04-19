#include <iostream>

class C
{
public:
    C(int32_t &b_) : a(new int32_t[10]), b(b_)
    {
    }
    //const 멤버 함수getC()가 const 포인터를 반환하고 있습니다.(준수) 
    const int32_t *getC() const
    {
        return &b;
    }

private:
    int32_t *a;
    int32_t &b;
};

int main(void){return 0;}