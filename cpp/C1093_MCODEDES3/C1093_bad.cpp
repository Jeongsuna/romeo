void DoSomething()
{

}
void fn ( void ) 
{ 
    DoSomething ( ); 
    // 함수 내부가 아닌 직접 어셈블리 코드를 사용하고 있습니다.(비준수)
    asm ( "NOP" 
         :
         :
         :
    );
    DoSomething ( ); 
}

int main(void){return 0;}