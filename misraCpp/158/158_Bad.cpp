#include <iostream>

class B1 
{ 
public: 
    // B2와 같은 변수(count), 함수(foo) 이름을 사용하고 있습니다. (비준수)
    int32_t count; 
    void foo ( );
};

class B2 
{ 
public: 
    // B1과 같은 변수(count), 함수(foo) 이름을 사용하고 있습니다. (비준수)
    int32_t count; 
    void foo ( );
};

class D : public B1, public B2 
{ 
public: 
    void Bar ( ) 
    { 
        // count 변수를 사용할 때 어떤 count인지 모호합니다.
        ++count; 
        // foo 함수를 호출할 때 어떤 foo인지 모호합니다.
        foo ( ); 
    } 
};

int main(void){return 0;}