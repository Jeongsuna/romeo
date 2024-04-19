#include <iostream>

// 단일 매크로 정의에서 # 또는 ## 연산자를 여러번 사용합니다.
#define C(x, y) # x ## y 
#define D(x, y, z, yz) x ## y ## z


int main(void){return 0;}