#include <iostream>
#include <typeinfo>

class B2 {
public:
    virtual ~B2();
    virtual void foo();
    B2() {
        // 생성자에서 객체의 동적타입을 사용하고 있습니다.(비준수)
        typeid(B2);
        // 단순한 멤버 함수 호출이며 동적 타입을 사용하지 않습니다.(준수)          
        B2::foo();        
        // 객체의 동접 타입을 사용하고 있습니다.(비준수)
        foo();
        // 객체의 동접 타입을 사용하고 있습니다.(비준수)
        dynamic_cast<B2*>(this); 
    }
};

int main(void){return 0;}