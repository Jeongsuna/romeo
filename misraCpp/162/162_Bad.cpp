#include <iostream>


class C 
{ 
public: 
    // NON-POD 클래스에서 public 멤버 데이터로 선언되었습니다.(비준수)
    int32_t b;
protected: 
    // NON-POD 클래스에서 protected 멤버 데이터로 선언되었습니다.(비준수)
    int32_t c;
};

int main(void){return 0;}