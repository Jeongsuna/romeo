// #include <iostream>

void Delay_a ( void ) 
{   
    //어셈블러 명령어는 asm 선언을 통해서만 도입해야 합니다.(준수)
    asm ( "NOP" 
         :
         :
         :
    );
}

int main(void){return 0;}