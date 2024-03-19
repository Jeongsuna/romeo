#include <iostream>

class A
{
public:
    // const 선언을 할 수 있습니다.(비준수)
    int16_t f1()
    {
        return m_i;
    }
    // static 선언을 할 수 있습니다.(비준수)
    int16_t f2() 
    {
        return m_s;
    }
private:
    int16_t m_i;
    static int16_t m_s;
};

int main() {
    return 0;
}