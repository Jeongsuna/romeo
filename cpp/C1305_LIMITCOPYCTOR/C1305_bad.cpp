#include <cstdint>

class A {
public:
    // 기본 생성자
    A() : m_i(0) {}

    A(const A& rhs)
        : m_i(rhs.m_i)
    {
        // 복사 생성자에서 정적 멤버 변수(m_static)의 변경은 허용되지 않습니다. 비준수 - (이슈지점)
        ++m_static; 
    }

private:
    int32_t m_i;
    
    // 비준수 - (원인지점)
    static int32_t m_static;
};

int32_t A::m_static = 0;

A f() {
    return A();
}

void b() {
    A a = f();
}

int main() {
    return 0;
}