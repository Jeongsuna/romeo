void DoSomething()
{
    
}
void Delay ( void ) 
{ 
    // 어셈블리 코드가 함수 내부에 캡슐화 되고 격리되어야 합니다.(준수)
    asm ( "NOP" 
         :
         :
         :
    );
}

void fn ( void ) 
{ 
    DoSomething ( ); 
    
    // 어셈블리 코드가 캡슐화 되어 있습니다.
    Delay ( );

    DoSomething ( ); 
}

int main(void){
    return 0;
}