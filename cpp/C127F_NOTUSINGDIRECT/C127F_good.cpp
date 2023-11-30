#include <iostream>

// 방법1. using-declaration 사용합니다.(준수)
namespace NS2
{
 int i2;
 int j2;
 int k2;
}
using NS2::j2;

// 방법2. 완전히 정규화된 이름을 사용합니다.(준수)
namespace NS3
{
 int i3;
 int j3;
 int k3;
}

void f ()
{
 ++NS3::k3;
}

int main(void){
    return 0;
}