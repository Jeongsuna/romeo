#include <iostream>

void f1() 
{ 
    // 동적 힙 메모리 할당은 사용하지 않아야 합니다.
    int32_t * i = new int32_t;
    delete i; 
}

int main(void){return 0;}