#include <iostream>

namespace NS 
{ 
    // 매크로를 네임스페이스 내에서 정의하고 있습니다.(비준수)
    #define FOO 
    // 매크로를 네임스페이스 내에서 해제하고 있습니다.(비준수)
    #undef FOO
}

int main(void){return 0;}