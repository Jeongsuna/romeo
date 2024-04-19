#include "C125B__amp_overload_bad.h"

void f2(A &a)
{
    // Non-compliant: 내장된(빌트인) & 연산자를 사용합니다
    &a;
}