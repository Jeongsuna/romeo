#include <iostream>

// 클래스 B1과 B2는 동일한 계층 구조에서 다중 상속하고 있으며 가상 상속을 사용하고 있습니다.(준수)
class A {};
class B1: public virtual A {};
class B2: public virtual A {};
// 클래스 C가 클래스  B1, B2를 다중 상속하고 있습니다.(준수)
class C: public B1, B2 {};

int main(void){return 0;}