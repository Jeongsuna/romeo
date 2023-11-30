#include <iostream>

// 전역 네임스페이스에는 main, 네임스페이스 선언 및 extern "C" 선언만 포함되어야 합니다.
// 무명(unnamed)네임스페이스에 변수와 함수 선언 (준수)
namespace
{

    void f2(int);
    int x2;
}

// MY_API 네임스페이스에 변수와 함수 선언 (준수)
namespace MY_API
{
    void b2(int);
    int y2;
}

// main 함수는 전역 네임스페이스에 선언 될 수 있습니다.(준수)
int main()
{
    return 0;
}