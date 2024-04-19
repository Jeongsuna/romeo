#include <csignal>
#include <cstdint>

void my_handler ( int32_t );

void f1 ( )
{
    // 신호 처리 기능을 사용하고있습니다 (비준수)
    signal ( 1, my_handler );
}

int main()
{
    f1();
    return 0;
}