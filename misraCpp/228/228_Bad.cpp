// <cstdio> 헤더를 사용하지 말아야 합니다.
#include <cstdio>

void fn() 
{ 
    char array [10];
    // 버퍼 오버런이 발생 할 수 있습니다.
    gets (array);
}

int main(void){return 0;}