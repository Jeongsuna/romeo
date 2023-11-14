#include <iostream>

class B {};
// class D가 class B를 가상(base) 클래스로 상속받고 있습니다.(비준수)
class D: public virtual B {};

int main(void){return 0;}