#include <iostream>
#include <setjmp.h>

void f2();
jmp_buf buf;

void f1()
{
    // setjmp 매크로는 사용할 수 없습니다.
    if (!setjmp(buf))
    {
        f2();
    }
    else
    {
        //...
    }
}

void f2()
{
    // longjmp 함수는 사용할 수 없습니다.
    longjmp(buf, 10);
}

int main(void){return 0;}