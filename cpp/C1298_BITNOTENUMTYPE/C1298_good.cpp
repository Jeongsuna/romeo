#include <iostream>

struct S 
{ 
    // 비트 필드에는 열거형 타입을 사용하면 안 됩니다.(준수)
    signed int a : 1;
    signed int b : 4;
    signed int c : 2;
    signed int d : 2;
};

int main(void){return 0;}