#include <iostream>

class C
{
public:
    int32_t& getA()
    {
        // a라는 클래스 데이터 멤버에 대한 non-const 참조를 반환합니다.(비준수)
        return a;
    }

private:
    int32_t a;
};

void b(C& c)
{
    int32_t& a_ref = c.getA();
    // a_ref를 수정할 수 있습니다.
    a_ref = 10; 
}

int main(void){return 0;}