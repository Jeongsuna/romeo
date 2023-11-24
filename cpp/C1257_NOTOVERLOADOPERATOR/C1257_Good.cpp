#include "util.h"
class A 
{ 
public: 
    UtilType getValue( ); 
    UtilType setValue(UtilType const &);
};

// 쉼표 연산자, & 연산자 및 || 연산자에 오버로딩 하지 않아야 합니다.(준수)
void f1(A &a1, A &a2) 
{ 
    if (a1.getValue())
    {
        a2.setValue(0);
    }
}

int main(void){return 0;}
