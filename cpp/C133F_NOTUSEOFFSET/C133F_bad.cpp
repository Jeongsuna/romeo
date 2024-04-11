#include <cstddef>
#include <cstdint>

struct A
{
    int32_t i;
};

void f1()
{
    // offsetof 매크로를 사용했습니다. (비준수)
    offsetof(A, i);
}

int main()
{
    f1();
    return 0;
}