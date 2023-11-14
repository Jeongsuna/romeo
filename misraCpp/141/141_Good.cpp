#include <iostream>

// 함수의 재선언에서 매개변수에 사용되는 식별자는 선언의 식별자와 동일해야 합니다.(준수)

// void CreateRectangle ( uint32_t Height, uint32_t Width );
void CreateRectangle ( uint32_t Height, uint32_t Width );
//  void fn1 ( int32_t a);
void fn1 ( int32_t a )
{   
}

// 함수의 재선언에서 무명 매개변수에 사용되는 식별자는 예외입니다.(준수)
void fn2 ( int32_t b )
{ 
}

int main(void){return 0;}