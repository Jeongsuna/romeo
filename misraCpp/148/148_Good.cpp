#include <iostream>

class C
{
public:
    C(int32_t* shared) : m_shared(shared)
    {
    }

    int32_t* getA()
    {
        // m_shared는 int32_t* 형식의 포인터이며 클래스의 내부 상태를 직접적으로 나타내는 데이터가 아닙니다.
        return m_shared;
    } 

private:
    int32_t* m_shared;
};

int main(void){return 0;}