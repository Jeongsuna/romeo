#include <iostream>

class A {};
class B: public virtual A {};
class C: public virtual A {};
class D: public B, C {};
// D가 클래스 A를 가상으로 상속하고 있습니다.
class E: public virtual A {};
int main(void){return 0;}