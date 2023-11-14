#include <iostream>

class C 
{ 
public: 
    C(int32_t &b_) : a(new int32_t[10]), b(b_)
    { 
    }
    // const 멤버 함수getA()가 non-const 포인터를 반환하고 있습니다.(비준수) 
    int32_t *getA() const
    { 
        return a; 
    }
    // const 멤버 함수getB()가 non-const 포인터를 반환하고 있습니다.(비준수) 
    int32_t *getB() const
    { 
        return &b; 
    }
private: 
    int32_t *a; 
    int32_t &b; 
};

int main(void){return 0;}