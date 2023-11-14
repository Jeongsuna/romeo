#include <iostream>
#include <csignal>

void my_handler ( int32_t ){}
void f1() 
{
    // signal 대신 std::signal을 사용하여 시그널 핸들러를 등록합니다.
    std::signal(SIGINT, my_handler);
}

int main(void){return 0;}