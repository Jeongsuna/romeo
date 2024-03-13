#include <iostream>

namespace NS_C1281_GOOD
{
    int goodMember;
}
// using-directives 및 using-declarations 는 헤더 파일에 사용하지 않습니다.(Compliant)

// 클래스 범위 또는 함수 범위 using-declarations 는 예외
void C1281_func() {
    // (Compliant)
    using NS_C1281_GOOD::goodMember;
}
