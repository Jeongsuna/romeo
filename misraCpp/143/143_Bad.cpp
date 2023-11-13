#include <iostream>

extern void f ( void )
{

}

int main(){
    // 함수 식별자 'f' 를 직접 사용하고 잇습니다.(비준수)
    if ( 0 == f ) 
    { 
        // ... 
    }

    // 함수 식별자 f를 직접 함수 포인터에 할당하고 있습니다.(비준수)
    void (*p)( void ) = f;
    
    return 0;
}
