#include <iostream>

// File1
void CreateRectangle ( uint32_t Height, uint32_t Width );
// File2
// CreateRectangle함수를 재선언할때 매개변수 순서가 달라졌습니다.(비준수)
void CreateRectangle ( uint32_t Width, uint32_t Height );

void fn1 ( int32_t a ); 

// fn1함수를 재선언할때 매개변수 a를 b로 다시선언 하고있습니다.(비준수)
void fn1 ( int32_t b )
{ 
}

int main(void){return 0;}