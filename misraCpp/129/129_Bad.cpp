#include <iostream>

namespace NS1 
{ 
    void f( uint16_t );
}
//  어떤 f 함수를 호출해야 하는지 모호하게 됩니다.(비준수)
using NS1::f;

namespace NS1 
{ 
    // 다른 자료형으로 f 재선언
    void f( uint32_t );
}

void bar() 
{ 
    f( 0U ); 
}

int main(void){return 0;}