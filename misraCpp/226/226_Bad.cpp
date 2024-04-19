#include <iostream>
#include <csignal>

void my_handler(int){}

void f1() 
{
    // <csignal>의 신호 처리 기능을 사용해서는 안 됩니다.
    signal(1, my_handler);
}

int main(void){return 0;}