#include <iostream>

struct S 
{ 
    // 부호 있는 정수 타입을 갖는 네임드 비트-필드(b)는 1비트 초과의 길이를 가져야 합니다.(준수)
    signed int : 1;
    signed int : 0;
    signed int b : 2;
    signed int : 2;
};

int main(void){return 0;}