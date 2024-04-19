#include <setjmp.h>

void f2();
jmp_buf buf;

void f1()
{
    // setjmp 매크로는 사용할 수 없습니다. (비준수)
    if (!setjmp(buf))
    {
        f2();
    }
    else
    {
        ...
    }
}

void f2()
{
    // longjmp 함수는 사용할 수 없습니다. (비준수)
    longjmp(buf, 10);
}

int main(){
    return 0;
}