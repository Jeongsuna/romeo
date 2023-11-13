#include <iostream>

int32_t * fn1(int32_t &x)
{
    //int32_t 형식의 참조 매개변수(x)를 받고, 포인터로 반환하려고 합니다.(비준수)
    return (&x); 
}

int32_t * fn2()
{
    //int32_t 형식의 지역 변수 i를 생성하고 fn1(i)를 호출하여 포인터로 반환하려합니다(비준수)
    int32_t i = 0;
    return fn1(i);
}

const int32_t * fn3(const int32_t &x)
{
    //const int32_t 형식의 상수 참조 매개변수(x)를 받고, 포인터로 반환하려고 합니다.(비준수)
    return (&x); 
}

int32_t & fn4(int32_t &x)
{
    // fn4 함수는 int32_t 형식의 참조 매개변수(x)를 받고, 참조로 반환하려고 합니다.(비준수)
    return (x); 
}

const int32_t & fn5(const int32_t &x)
{
    // fn5 함수는 const int32_t 형식의 상수 참조 매개변수(x)를 받고, 참조로 반환하려고 합니다.(비준수)
    return (x); 
}

int main(void){return 0;}