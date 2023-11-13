#include <ctime>
#include <iostream>

void f() 
{ 
    // 라이브러리<ctime>의 시간 처리 기능(clock)은 사용할 수 없습니다.
    clock();
}

int main(void){return 0;}