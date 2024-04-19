// <iostream> 헤더를 사용합니다.
#include <iostream>

void fn()
{
    char array[10];
    // 안전한 입력 방법 사용합니다.
    std::cin.getline(array, sizeof(array));
}

int main(void){
    fn();
    return 0;
}