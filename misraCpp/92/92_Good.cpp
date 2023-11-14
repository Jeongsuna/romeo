// A.h
class A
{
public:
    //단항 & 연산자 오버로딩을 제거합니다.(준수)
};

// f1.cc
class A;
void f(A &a)
{
    // 내장된(빌트인) & 연산자를 사용합니다
    &a;
}

// f2.cc
#include "A.h"
void f2(A &a)
{
    // 사용자 정의된 & 연산자를 사용합니다
    &a;
}

int main(void){return 0;}