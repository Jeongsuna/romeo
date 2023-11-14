#include <iostream>

class A {};
class B1: public virtual A {};
class B2: public virtual A {};
class B3: public A {};
// 클래스 C가 클래스 B1, B2 및 B3를 다중 상속하고 있고,
// 클래스 B3는 클래스 A를 비가상(non-virtual) 상속하고 있습니다.(비준수)
class C: public B1, B2, B3 {};

int main(void){return 0;}