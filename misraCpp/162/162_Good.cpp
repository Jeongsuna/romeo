#include <iostream>

class C 
{ 
private: 
    // NON-POD 클래스에서는 private 멤버 데이터로 선언되어야 합니다.(준수)
    int32_t d;
};

int main(void){return 0;}