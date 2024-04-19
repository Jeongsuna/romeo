#include <iostream>

class C2 
{ 
public: 
    ~C2 ( ) 
    { 
        // 소멸자에서 예외가 발생하여 소멸자 외부로 빠져나감
        throw (42);
    } 
};

void foo ( ) 
{ 
    // c의 소멸자에서 발생한 예외로 인해 프로그램이 비정상적으로 종료됩니다.
    C2 c;
    throw (10); 
}

int main(void){return 0;}