#include <iostream>
#include <stdexcept>

// setjmp 매크로와 longjmp 함수를 사용하지않고
// C++ 표준 라이브러리를 이용하여 예외 발생 및 처리를 할 수 있습니다.
void f2();

void f1()
{
    try
    {
        f2();
    }
    catch (const std::exception& e)
    {
        // 예외 처리
        ...
    }
}

void f2()
{
    // 예외 발생
    throw std::runtime_error("An error occurred");
}

int main(){
    return 0;
}