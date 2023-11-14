#include "util.h"
class A 
{ 
public: 
    UtilType getValue( ); 
    UtilType setValue(UtilType const &); 
};

void f1(A &a1, A &a2) 
{ 
    a1.getValue() && a2.setValue(0);
}

// && 연산자에 오버로딩 하고 있습니다.(비준수)
bool operator &&(UtilType const &, UtilType const &);

void f2(A &a1, A &a2) 
{ 
    // 두 피연산자가 평가될 수 있습니다.
    a1.getValue() && a2.setValue(0);
}

int main(void){return 0;}