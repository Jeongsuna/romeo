#include <iostream>

class C
{
public:
    // 각 클래스 생성자는 해당 클래스의 모든 비정적 멤버를 초기화해야 합니다.(준수)
    C() : m_a(10), m_b(7)
    {
    }

    int32_t GetmB(void)
    {
        return m_b;
    }
    
private:
    int32_t m_a;
    int32_t m_b;
};

C c;

int main(void)
{
    if (c.GetmB() > 0)
    {
    }
}