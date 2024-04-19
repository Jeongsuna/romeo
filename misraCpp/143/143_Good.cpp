#include <iostream>

extern void f ( void )
{

}

int main(){
    // 주소 연산자(&)를 사용하여 함수의 주소를 검사하고 있습니다.(준수)
    if ( 0 == &f )
    { 
        //함수가 호출되고 있습니다.(준수) 
        (f)(); 
    }
    // 함수의 주소(&f)를 함수 포인터에 할당 하고있습니다.(준수)
    void (*p)( void ) = &f;

    return 0;
}
