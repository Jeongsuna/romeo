#include <iostream>
#include <stdint.h>

class A
{

};

void fn(int16_t i)
{
    static A a1;
    A* a2 = new A;

    if (i > 10)
    {
        // 예외를 던질 때 포인터 타입을 사용 (비준수)
        throw &a1;
    }
    else
    {
        // 예외를 던질 때 포인터 타입을 사용 (비준수)
        throw a2;
    }
}

int main(void){
    return 0;
}