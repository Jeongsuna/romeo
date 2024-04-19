#include <iostream>
#include <stdint.h>

namespace NS_Bad
{ 
    void f_bad( uint16_t );
}
//  어떤 f_bad 함수를 호출해야 하는지 모호하게 됩니다.(비준수)
using NS_Bad::f_bad;

namespace NS_Bad 
{ 
    // 다른 자료형으로 f_bad 재선언
    void f_bad( uint32_t );
}

int main(void){

    f_bad( 0U );

    return 0;
}