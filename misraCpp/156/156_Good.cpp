#include <iostream>

class A {};
// 기본 클래스A는 다이아몬드 계층 구조에서 사용되고 있어 virtual로 선언할 수 있습니다.(준수)
class B1: public virtual A {}; 
class B2: public virtual A {};
// 다이아 몬드 계층 구조를 형성하고 있습니다.(준수)
class C: public B1, B2 {};

int main(void){return 0;}