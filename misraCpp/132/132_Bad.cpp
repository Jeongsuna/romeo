#include <iostream>

void Delay_b(void) 
{ 
    #pragma asm
    // #pragma asm와 #pragma endasm를 사용하여 어셈블러 명령어를 도입하려 시도하고있습니다.(비준수)
    "NOP" 
    #pragma endasm 
}

int main(void){return 0;}