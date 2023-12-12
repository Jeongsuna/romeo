#include <stdint.h>

struct S 
{ 
    // 부호 있는 정수 타입을 갖는 네임드 비트-필드(a)가 1 입니다.(비준수) 
    signed int a : 1;
};

int main(void){return 0;}