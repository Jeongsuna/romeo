#include <iostream>

class A {};
// D가 클래스 A를 가상으로 상속하고 있습니다.
// 다이아 몬드 계층 구조와 관련이 없습니다.(비준수)
class D: public virtual A {};

int main(void){return 0;}