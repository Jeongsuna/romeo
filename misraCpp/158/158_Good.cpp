#include <iostream>

class B1 
{ 
public: 
    // 변수(countB1), 함수(fooB1) 이 각 고유하게 선언되었습니다.(준수)
    int32_t countB1; 
    void fooB1( );
};

class B2 
{ 
public: 
    // 변수(countB2), 함수(fooB2) 이 각 고유하게 선언되었습니다.(준수)
    int32_t countB2; 
    void fooB2( );
};

class D : public B1, public B2 
{ 
public: 
    void Bar ( ) 
    { 
        // 명확하게 변수 함수를 호출 할 수 있습니다.
        ++countB1; 
        ++countB2; 
        fooB1( );
        fooB2( ); 
    } 
};

int main(void){return 0;}