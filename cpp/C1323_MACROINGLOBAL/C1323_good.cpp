#include <iostream>

#ifndef MY_HDR
// 매크로를 전역 스페이스에서 정의하고 있습니다.(준수) 
#define MY_HDR
namespace NS    
{ 
    // 매크로는 전역 네임스페이스에서만 #define되거나 #undef되어야 합니다.
}
#endif

int main(void){return 0;}