#include <iostream>

// 단일 매크로 정의에서 # 또는 ## 연산자는 최대 한번 까지 사용가능합니다.
#define A(x) #x 
#define B(x, y) x ## y

int main(void){return 0;}