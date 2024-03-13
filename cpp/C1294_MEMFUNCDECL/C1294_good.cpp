#include <iostream>

class A
{
public:
    // const로 선언되어 데이터를 수정할 수 없습니다.(준수)
    int16_t f1() const 
    {
        return m_i;
    }
    // static으로 선언되어 객체의 상태를 변경할 수 없습니다.(준수)
    static int16_t f2()
    {
        return m_s;
    }
    // 객체의 상태를 변경하고 객체의 상태를 사용하므로 const나 static으로 선언할 수 없습니다.(준수) 
    int16_t f3()
    {
        return ++m_i;
    } 
    int16_t f4()
    {
        return m_i++;
    } 
    int16_t f5() const
    {
        return m_c;
    }
private:
    int16_t m_i;
    static int16_t m_s;
    const int16_t m_c; 
};

int main() {
    return 0;
}