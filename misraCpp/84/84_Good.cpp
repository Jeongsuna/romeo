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
    // S 구조체 포인터 s를 int32_t 정수로 변환하고 있습니다.(rule 5-2-7 준수)
    // rule 5-2-9(비준수)
    int32_t i = reinterpret_cast< int32_t >( s );
    // int32_t 정수 i를 S 구조체 포인터로 변환하고 있습니다.(rule 5-2-7 준수)
    // rule 5-2-8(비준수)
    S * e = reinterpret_cast< S * >( i );
}

int main(void){return 0;}