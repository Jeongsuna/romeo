#include <iostream>

class C
{
public:
    // m_b가 생성자 초기화 목록에 포함되지 않았습니다.(비준수)
    C(int32_t a) : m_a(a)
    {
    }
    
    int32_t GetmB(void)
    {
        return (m_b);
    }
    
private:
    int32_t m_a;
    int32_t m_b;
};

C c(5);

int main(void)
{
    // m_b 가 초기화되지 않았습니다.(비준수)
    if (c.GetmB() > 0)
    {
    }
}