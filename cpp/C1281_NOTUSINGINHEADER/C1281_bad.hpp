namespace NS_C1281_BAD
{
    int badMember;
}
// 헤더 파일에서 using-directives 를 사용하고 있습니다.(Non-compliant)
using namespace NS_C1281_BAD;
// 헤더 파일에서 using-declarations 를 사용하고 있습니다.(Non-compliant)
using NS_C1281_BAD::badMember;