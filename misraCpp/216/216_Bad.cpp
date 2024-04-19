#include <iostream>

// 표준 라이브러리 함수의 이름을 재정의 하고 있습니다.
int32_t printf ( int32_t a, int32_t b )
{ 
    return ( ( a > b ) ? a : b ); 
}


int main(void){return 0;}