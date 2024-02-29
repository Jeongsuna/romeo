#include <cstdint>
#include <cstdlib>

void f1()
{
    // 스택 변수를 사용합니다.
    int32_t i;
    // 동적 메모리 할당 및 해제가 없음(준수)
}

int main()
{
    f1();
    return 0;
}