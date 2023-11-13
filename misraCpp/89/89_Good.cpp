#include <stdint.h>

void f3( int32_t ( &p )[ 10 ] );

void f3(int32_t (&p)[10]) {
    // 여기에 f3 함수의 구현을 추가합니다.
}

void b () 
{ 
    int32_t a[ 10 ]; 
    // f3 함수가 호출될 때 배열 "a"는 참조로 전달되며, 이는 배열의 차원성을 보존하게 됩니다.(준수)
    f3( a );
}


int main(void){return 0;}
