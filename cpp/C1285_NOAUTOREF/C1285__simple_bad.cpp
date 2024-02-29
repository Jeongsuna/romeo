#include <iostream>

int32_t * fn1 ( void ) 
{ 
    int32_t x = 99;
    // 자동 변수 x 의 주소를 포인터로 반환하고 있습니다.(비준수)
    return ( &x ); 
}

int32_t * fn2 ( int32_t y ) 
{ 
    // 매개 변수 y의 주소를 포인터로 반환하고 있습니다.(비준수)
    return ( &y ); 
}

int32_t & fn3 ( void ) 
{ 
    int32_t x = 99;

    // 자동 변수 x 의 주소를 참조로 반환하고 있습니다.(비준수)
    return ( x ); 
}

int32_t & fn4 ( int32_t y ) 
{ 
    // 매개 변수 y 의 주소를 참조로 반환하고 있습니다.(비준수)
    return ( y ); 
}

int main(void){return 0;}