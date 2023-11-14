#include <iostream>
#include <typeinfo>

class B1 {
public:
    B1() {
        // 객체의 동적 타입을 사용하지 않고 있습니다. B1은 다형적이지 않습니다.(준수)
        typeid(B1);
    }
};

int main(void){return 0;}