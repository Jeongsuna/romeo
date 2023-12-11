#include <iostream>

// # 및 ## 연산자를 사용하고 있습니다.
#define A(Y) #Y 
#define A(X,Y) X##Y 


int main(void){return 0;}