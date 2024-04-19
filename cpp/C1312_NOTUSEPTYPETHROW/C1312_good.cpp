#include <iostream>
#include <stdint.h>

class A
{
public:
    A() {}
};

void fn(int16_t i)
{
    // A 클래스의 객체를 스택에 할당
    A a1;
    A a2;

    if (i > 10)
    {
        // 예외를 던질 때 객체를 직접 사용 (준수)
        throw a1;
    }
    else
    {
        // 예외를 던질 때 객체를 직접 사용 (준수)
        throw a2;
    }
}

int main(void){
    return 0;
}