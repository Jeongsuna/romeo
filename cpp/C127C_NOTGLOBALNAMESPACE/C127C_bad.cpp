#include <iostream>

// 이 함수(f1)과 변수(x1)은 전역 네임스페이스에 선언됬습니다.(비준수)
void f1(int);
int x1;

// 무명(unnamed)네임스페이스
namespace
{
    void g2(int);
    int y2;

}

int main()
{
    return 0;
}
